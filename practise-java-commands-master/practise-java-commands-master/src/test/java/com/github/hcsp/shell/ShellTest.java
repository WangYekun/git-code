package com.github.hcsp.shell;

import com.github.hcsp.test.helper.ExecResult;
import com.github.hcsp.test.helper.ProcessRunner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShellTest {
    @Test
    public void testReadEnvAndSystemProperty() {
        String stdout =
                runIn("read-env-variable-system-property", "bash", "solution.sh")
                        .assertZeroExitCode()
                        .getStdout();
        Assertions.assertTrue(stdout.contains("Environment variable AAA: $A;"));
        Assertions.assertTrue(stdout.contains("System property BBB: '"));
    }

    @Test
    public void testCompileRun() {
        String stdout =
                runIn("compile-run-with-classpath", "bash", "solution.sh")
                        .assertZeroExitCode()
                        .getStdout();
        Assertions.assertTrue(stdout.contains("Args size: 3"));
        Assertions.assertTrue(stdout.contains("First argument is blank: true"));
        Assertions.assertTrue(stdout.contains("Second argument is blank: true"));
        Assertions.assertTrue(stdout.contains("Third argument is blank: false"));
    }

    @Test
    public void testStdoutStderr() throws IOException {
        runIn("system-out-system-err", "bash", "solution.sh").assertZeroExitCode();
        String file =
                new String(
                        Files.readAllBytes(
                                getTestDir("system-out-system-err")
                                        .toPath()
                                        .resolve("output.txt")));
        Assertions.assertTrue(file.contains("This is system out!"));
        Assertions.assertTrue(file.contains("This is system err!"));
    }

    private ExecResult runIn(String subDir, String... commands) {
        return ProcessRunner.exec(getTestDir(subDir), commands);
    }

    private File getTestDir(String subDir) {
        return Paths.get(System.getProperty("user.dir")).resolve(subDir).toFile();
    }
}
