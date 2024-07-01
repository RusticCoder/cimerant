# Cimerant, a model-driven template code generator tool to create templated applications using [Apache Velocity][1] and formatted text files as the object model.

![logo](https://rusticcoder.github.io/images/Cimerant1.png)

[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg)](CODE_OF_CONDUCT.md)
![Java Open JDK](https://img.shields.io/badge/java-%23ED8B00.svg?logo=openjdk)
[![Validate](https://github.com/RusticCoder/cimerant/actions/workflows/validate.yml/badge.svg)](https://github.com/RusticCoder/cimerant/actions/workflows/validate.yml)
[![Deploy](https://github.com/RusticCoder/cimerant/actions/workflows/deploy.yml/badge.svg)](https://github.com/RusticCoder/cimerant/actions/workflows/deploy.yml)

* * *

## Contents

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

<!-- code_chunk_output -->

- [Introduction](#introduction)
- [Intended Audience](#intended-audience)
- [Template Model Driven Development Approach](#template-model-driven-development-approach)
- [Apache Velocity Integration](#apache-velocity-integration)
- [Summary](#summary)
- [Typical Workflow](#typical-workflow)
  - [Modeling Phase](#modeling-phase)
  - [Template Definition](#template-definition)
  - [Model Transformation / Code Generation](#model-transformation-code-generation)
  - [Iteration and Refinement](#iteration-and-refinement)
- [Benefits](#benefits)
  - [Productivity](#productivity)
  - [Consistency](#consistency)
  - [Maintainability](#maintainability)
  - [Reuse](#reuse)
  - [Overall](#overall)
- [Application History](#application-history)
- [Usage](#usage)
  - [Single Template](#single-template)
  - [Errors](#errors)
- [Glossary](#glossary)
  - [Cimolite](#cimolite)
  - [Cimerant](#cimerant)
- [Appendices](#appendices)
- [Maven Usage](#maven-usage)
- [Memory Analyzer](#memory-analyzer)
  - [Java Monitoring and Management Console](#java-monitoring-and-management-console)
  - [Memory Analyzer (MAT) in Eclipse](#memory-analyzer-mat-in-eclipse)
  - [NetBeans Memory Profiler](#netbeans-memory-profiler)
- [Profiling](#profiling)
  - [Java Flight Recorder](#java-flight-recorder)
- [Running](#running)
  - [Via JAR](#via-jar)
  - [Via Executable](#via-executable)
- [References](#references)
- [Community](#community)

<!-- /code_chunk_output -->

* * *

## Introduction

This innovative tool converts object models to software source code files
through [Apache Velocity templates][2], enabling the rapid generation of
application scaffolding encompassing the data access layer, business logic
layer, and presentation layer. Developers can tailor these [Velocity
templates][2] to meet specific coding standards and application requirements,
ensuring flexibility and customization.

With Cimerant, developers can swiftly generate, develop, and deploy modern web
applications, thanks to its command-line interface (CLI) that facilitates
seamless code generation tasks. Cimerant is adept at supporting a wide
range of technologies and platforms, making it suitable for applications
requiring rapid prototyping and code scaffolding.

By automating code generation based on predefined [Velocity templates][2] and
object models, Cimerant ensures consistency and reduces errors across different
parts of the application. It also offers extensive customization options,
allowing developers to create their own templates and integrate custom object
models.

Cimerant is a cutting-edge application development tool that employs template
model-driven development principles along with the power of [Apache
Velocity][1], specifically leveraging the capabilities as a template code
generator, to streamline the creation of templated applications. At its core,
Cimerant employs [Apache Velocity][1], a powerful template engine, to streamline
the generation of a codebase. It serves as a object model transformer, utilizing
[Velocity templates][2] to mold object models akin to modeling clay.

## Intended Audience

This document is written for application developers to understand the intended
implementation of Cimerant.

## Template Model Driven Development Approach

Cimerant utilizes a set of user defined templates for different components and
modules within the application. These templates encapsulate common patterns,
structures, and functionalities required for the application.

The template model-driven development approach involves Cimerant as the source
code generator that interprets the object model and the user configuration, then
generates code artifacts based on predefined templates. These templates define
the structure of the application's backend, frontend, and database layers.

Cimerant incorporates a template application generator that orchestrates the
generation process, orchestrating the transformation of models into executable
code. This generator enables rapid prototyping and scaffolding of new
applications, significantly reducing development time and effort.

## Apache Velocity Integration

[Apache Velocity][1] serves as the template engine for Cimerant, facilitating
the layout, structure, and dynamic generation of HTML, CSS, JavaScript, source
code, and other resources required for the application.

These templates include placeholders for dynamic data and logic, allowing for
seamless integration with backend services and data sources.

Developers can customize [Velocity templates][2] to adapt the application's
layout, structure, look and feel, and functionalities. Velocity's flexible
syntax and powerful features enable extensive customization options to meet
diverse application requirements.

## Summary

Cimerant is a versatile tool that exemplifies the power and flexibility of
template model-driven development, and empowers developers to accelerate
software development, leveraging template code generation, and [Apache
Velocity][1] to create feature-rich applications tailored for agile teams. By
embracing template model-driven development principles, Cimerant accelerates
development, improves productivity, maintains and promotes code consistency, and
enables rapid customization to meet evolving application needs, all while
providing a standardized approach to code generation.

## Typical Workflow

### Modeling Phase

In the modeling phase, developers create high-level object models that represent
various aspects of the software system, such as domain entities, business logic,
data structures, user interfaces, and system architecture. These models are
often created using graphical modeling languages, domain-specific languages
(DSLs), or textual representations.

### Template Definition

Next, developers define [Velocity templates][2] that specify the structure and
content of the code artifacts to be generated. Templates are written using the
[Velocity template language][2] that allows placeholders and dynamic content to
be included. These placeholders are later replaced with specific values derived
from the models.

### Model Transformation / Code Generation

In the transformation phase, the models are transformed into code artifacts
using the predefined templates via Cimerant. This transformation process
involves interpreting the models, applying transformation rules, and generating
code files based on the templates. The generated code may include source code
for classes, interfaces, methods, configuration files, database scripts,
documentation, and other artifacts.

This produces the final codebase for the software system. The generated code
adheres to the architecture, design patterns, coding standards, and best
practices defined by the [Velocity templates][2] and models. Developers can
customize the [Velocity templates][2] and models to tailor the generated code to
specific application requirements.

### Iteration and Refinement

Cimerant supports an iterative development approach, allowing developers to
refine and iterate on the models and [Velocity templates][2] throughout the
development lifecycle. Changes to the models or [Velocity templates][2]
automatically propagate to the generated code, ensuring consistency and
synchronization between the design and implementation.

## Benefits

### Productivity

Cimerant automates repetitive coding tasks, allowing developers to focus on
higher-level design and architecture concerns.

### Consistency

By generating code from models and templates, Cimerant promotes consistency and
reduces the risk of errors and inconsistencies across the codebase.

### Maintainability

Cimerant facilitates code maintenance and evolution by providing a structured
and standardized approach to code generation and modification.

### Reuse

Cimerant promotes code reuse by enabling developers to create reusable Velocity
templates and models that can be applied to multiple applications or domains.

### Overall

Template model-driven development is a powerful approach for accelerating
software development, improving code quality, and enhancing collaboration
between developers and domain experts. It leverages the benefits of model-driven
development while providing flexibility and customization through template-based
code generation.

## Application History

The desire to find a customizable template model-driven development solution
started with [JHipster](https://www.jhipster.tech). A wonderful product. It
could be extended by creating modules. Unfortunately in order to modify existing
functionality the only option was string matching. Due to this very fragile
implementation, the merging of modules with blueprints and the many fantastic
but overarching modifications; keeping the modules up-to-date and functional
became too challenging.

After over three years of focusing on [JHipster](https://www.jhipster.tech)
modules a new product was found. [Telosys](https://www.telosys.org). This is a
very expansive and impressive application. It is very good in a number of ways
but very difficult to expand upon. Telosys does a great job of demonstrating a
way of using [Velocity][1] which I had not seen before. This is the inspiration
for Cimerant.

## Usage

Cimerant will be a single Java executable (using
[jpackage](https://docs.oracle.com/en/java/javase/17/docs/specs/man/jpackage.html))
that can accept a combination of a configuration file and command-line
arguments. Using the executables location as the root directory all referenced
files will be in respect to the executables location.

### Single Template

usage: Cimerant

REQUIRED:

\-i,--input <input-file> The formatted input file to be transformed.

\-t,--template <template-file> The template to use to transform the input file.
(cannot be used in conjunction with -l, --list).

\--single Transform the template once for the entire model (cannot be used in
conjunction with --multi and cannot be used in conjunction with -l, --list).

\--multi Transform the template once for each class (cannot be used in
conjunction with --single and cannot be used in conjunction with -l, --list).

`${CLASS_NAME}` is required for multi and not allowed for single.

\-p,--path <path> The output path where to create the file/files relative to
the working directory (cannot be used in conjunction with -l, --list).

\-f,--file <file> The pattern for the file name to be created allowing
`${CLASS_NAME}` as a variable to be substituted when creating the file (cannot be
used in conjunction with -l, --list). `${CLASS_NAME}` is required for multi and
not allowed for single.

OTHER:

\-h,--help Display help and exit

\--key <key> The key in a key value pair.

\--value <value> The value in a key value pair.

Variables are key/value pairs that will be accessible within the Velocity
template. Duplicate keys are not allowed. Individual key/value pairs passed
in by the command-line will overwrite duplicate key/value pairs passed in
via a variable list.

\--trace Display trace logging.

\--debug Display debug logging.

\--info Display info logging.

\--warn Display warn logging.

\--error Display error logging.

\-l,--templates <template-list> A list of templates to use to transform the
input file. (See file format below)

\-x,--variables <variable-list> A list of Key/Value pairs that will be
accessible within the template.

**Variable List**

| Key             | Value           |
| --------------- | --------------- |
| a test string   | a test string   |
| a_test_string   | a_test_string   |
| a-test-string   | a-test-string   |
| a.test.string   | a.test.string   |
| a/test/string   | a/test/string   |
| a\\test\\string | a\\test\\string |

**Velocity Template List**

File format to list multiple [Velocity templates][2].

| Template          | Single/Multi | Output Path | File Pattern                   |
| ----------------- | ------------ | ----------- | ------------------------------ |
| SingleTemplate.vm | Single       | src         | Destination.xml                |
| MultiTemplate.vm  | Multi        | src         | Destination\_${CLASS_NAME}.xml |

### Errors

System/app abbreviation: Three characters to uniquely identify the application.

Component/module abbreviation: Three characters to uniquely identify the area
within the application.

Status code: Unique digits identifying the error within the component/module.

Error codes are displayed `<System/App>-<Component/Module>-<Status code>`

| Code | System/app description |
| ---- | ---------------------- |
| CMA  | Cimerant               |

| Code | Component/module description |
| ---- | ---------------------------- |
| M00  | Invalid Command              |
| M01  | Invalid Command Line Values  |
| M02  | Errors                       |
| M03  | Duplicate                    |
| M05  | Invalid Template List        |
| M06  | Invalid Variable List        |
| M07  | Invalid JSON Schema          |
| M08  | JSON Validation Error        |
| P00  | Invalid Parser               |

| code | Status code description                                       |
| ---- | ------------------------------------------------------------- |
| 0001 | Unknown error                                                 |
| 0002 | Invalid command-line argument                                 |
| 0003 | Duplicate command-line arguments                              |
| 0004 | Duplicate keys                                                |
| 0005 | Input file is required                                        |
| 0006 | Template is required                                          |
| 0007 | File pattern is required                                      |
| 0008 | Single or multi is required                                   |
| 0009 | Invalid input file path                                       |
| 0010 | Invalid template path                                         |
| 0011 | Invalid template list path                                    |
| 0012 | Invalid variable list path                                    |
| 0013 | Invalid template                                              |
| 0014 | Invalid template list                                         |
| 0015 | Invalid file pattern                                          |
| 0016 | Invalid file pattern ${CLASS_NAME} not allowed in single mode |
| 0017 | Invalid file pattern ${CLASS_NAME} required in multi mode     |
| 0018 | Single and multi cannot be used together                      |
| 0019 | Invalid variable list format                                  |
| 0020 | Invalid JSON file format for                                  |

## Glossary

### Cimolite

A soft clayey mineral of whitish or greyish colour.

### Cimerant

A combination of the words cimolite (clay) and alterant (transform) as a
representation of Cimerant changing design models into objects using
[Velocity][1] as the tool like transforming clay into ceramic art.

## Appendices

[Velocity a Java-based template engine][1]

## Maven Usage

export MAVEN_OPTS="
\-ea
\-Xmx512m
\-XX:+UseG1GC
\-XX:+HeapDumpOnOutOfMemoryError
\-Dcom.sun.management.jmxremote
\-Dorg.slf4j.simpleLogger.dateTimeFormat=HH:mm:ss,SSS
\-Dorg.slf4j.simpleLogger.defaultLogLevel=info
\-Dorg.slf4j.simpleLogger.showDateTime=true
\--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED
\--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED
\--add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED
\--add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED
"

mvn clean:clean compiler:compile assembly:single

## Memory Analyzer

### Java Monitoring and Management Console

The jconsole command launches a graphical console tool that enables you to
monitor and manage Java applications and virtual machines on a local or remote
machine.

-   [Using jconsole](https://docs.oracle.com/javase/1.5.0/docs/guide/management/jconsole.html)

### Memory Analyzer (MAT) in Eclipse

It allows Java developers to detect possible memory leakages and easily analyze
the heap dump, even if it contains millions of objects.

-   [Eclipse Memory Analyzer](https://projects.eclipse.org/projects/tools.mat)
-   [Memory Analyzer](https://wiki.eclipse.org/MemoryAnalyzer)
-   [Basic Tutorial](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.mat.ui.help%2Fgettingstarted%2Fbasictutorial.html)
-   [Kevin Grigorenko: Eclipse Memory Analyzer Tool &#124; SDJavaUsersGroup](https://www.youtube.com/watch?v=sLoifF_YA4w)

### NetBeans Memory Profiler

It can be used to analyze memory usage in Java FX, Java SE, EJB, mobile and web
applications.

-   [Exploring Java Heap Dumps Java Language label Ryan Cuprak &#124; Devoxx](https://www.youtube.com/watch?v=9Cnm2lFBe0I)

## Profiling

### Java Flight Recorder

Java Flight Recorder (JFR) is a tool for collecting diagnostic and profiling
data about a running Java application. It is integrated into the Java Virtual
Machine (JVM) and causes almost no performance overhead, so it can be used even
in heavily loaded production environments. When default settings are used, both
internal testing and customer feedback indicate that performance impact is less
than one percent. For some applications, it can be significantly lower. However,
for short-running applications (which are not the kind of applications running
in production environments), relative startup and warmup times can be larger,
which might impact the performance by more than one percent. JFR collects data
about the JVM as well as the Java application running on it.

-   [Flight Recorder and Cryostat &#124; DevNation Tech Talk](https://www.youtube.com/live/oPCTkW7S7T4?si=yF073B5g5G0WHRlY)

## Running

### Via JAR

Requires Java 17 and Maven to be installed.

```sh
> cd ~/
> git clone https://github.com/RusticCoder/cimerant.git
> cd ~/cimerant
> export MAVEN_OPTS="-ea -Xmx512m -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -Dcom.sun.management.jmxremote -Dorg.slf4j.simpleLogger.dateTimeFormat=HH:mm:ss,SSS -Dorg.slf4j.simpleLogger.defaultLogLevel=info -Dorg.slf4j.simpleLogger.showDateTime=true --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED"
> mvn clean compile assembly:single
> java -jar cimerant-1.0.0.jar --input model.json --templates TemplateList.md
```

### Via Executable

Requires Java 17 and Maven to be installed.

```sh
> cd ~/
> git clone https://github.com/RusticCoder/cimerant.git
> cd ~/cimerant
> export MAVEN_OPTS="-ea -Xmx512m -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -Dcom.sun.management.jmxremote -Dorg.slf4j.simpleLogger.dateTimeFormat=HH:mm:ss,SSS -Dorg.slf4j.simpleLogger.defaultLogLevel=info -Dorg.slf4j.simpleLogger.showDateTime=true --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED"
> mvn clean compile assembly:single
> jpackage --input target/ \
    --name Cimerant \
    --main-jar cimerant-1.0.0.jar \
    --main-class cimerant.Cimerant \
    --type exe \
    --java-options '--enable-preview'
> cimerant -help
```

## References

-   [Apache Velocity Project][1]
-   [Method Summary](METHOD_SUMMARY.md)
-   [VTL Reference][2]
-   Template examples can be found under the 'src/test/resources/cucumber'
    folder in the individual template folders.

## Community

Get updates on Cimerant's development.

-   Follow [@RusticCoder on Twitter](https://twitter.com/RusticCoder).
-   Discuss, ask questions, and more on [Cimerant subreddit](https://www.reddit.com/r/cimerant).
-   Help may be found on Stack Overflow at ([tagged Cimerant](https://stackoverflow.com/questions/tagged/Cimerant)).

[1]: https://velocity.apache.org "Apache Velocity Project"

[2]: https://velocity.apache.org/engine/2.3/vtl-reference.html "VTL Reference"
