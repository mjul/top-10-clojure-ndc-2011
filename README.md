# Top Ten Things to Learn From Clojure That Will Make You a Better Developer in Any Language

Presentation for NDC 2011 by Martin Jul.

## Abstract

Clojure is an exciting new functional programming language with a fresh approach to reducing the complexity of writing software for today's multi-core reality. 

Claiming that mutable state is the new spaghetti code, it radically simplifies concurrent programming by defaulting to immutability. This allows the programmer to safely share data between threads without getting into concurrency issues. 

The key enabler for this is a set of well-designed core data structures that provide fast, thread-safe data transformation without requiring locks or excessive copying.

We will learn how to use these concepts for managing application state and building concurrent systems and avoiding designing ourselves into the mess that is often associated with introducing threading in legacy applications.

We will also look at how its use of a small set of general data abstractions combined with the functional programming focus on avoiding side-effects make for powerful yet simple library design and how these ideas can be applied in other languages.

Finally, we will take a look at how to use software transactional memory and agent-based programming, and review how Clojure mixes these concepts with ideas from object-orientation. 


### Intended audience:

Developers interested in inspiration for their design, especially related to concurrent software.
No Clojure background required.



## Producing the Syntax Highlighted Code Examples
The project uses the Marginalia tools to produce HTML documentation from the sources.
Run `cake marg src test` to build the documentation that is needed for the presentation.


