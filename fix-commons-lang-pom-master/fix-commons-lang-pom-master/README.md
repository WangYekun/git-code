# Maven: 修复commons-lang项目的pom文件

你现在看到的是大名鼎鼎的[Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)项目。
我故意将其中的一些依赖包删除了，所以现在`mvn clean test`无法通过。请在[`pom.xml`](https://github.com/hcsp/fix-commons-lang-pom/blob/master/pom.xml)中补全缺失的第三方依赖，使得测试可以通过。

注意，Commons Lang是Java世界里非常重要的基础库，因此它的compile scope中不依赖任何的第三方库，添加的时候要注意。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean test`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [pom.xml](https://github.com/hcsp/fix-commons-lang-pom/blob/master/pom.xml)
-----


完成题目有困难？不妨来看看[写代码啦的相应课程](https://xiedaimala.com/tasks/661cd7ab-7fea-47d0-8e11-555d6fca751d)吧！

回到[写代码啦的题目](https://xiedaimala.com/tasks/661cd7ab-7fea-47d0-8e11-555d6fca751d/quizzes/6c87ef57-7f06-4af2-9112-86dd27ff099d)，继续挑战！
