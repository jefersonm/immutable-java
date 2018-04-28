# Java & Immutability

The idea for this repository is to add some examples of Immutable and Mutable classes, comparing the advantages of immutability.

This post has some good explanations about the topic: https://dzone.com/articles/taming-concurrency-with-immutability

As everything, there is always some trade-offs to be consider, below you can find some good and bad about immutability:

## Advantages

If the objects are immutable, creating concurrent applications are easy, as there is no worries about shared state.

## Disadvantages

When working with immutable objects, instead of re-using an existent object, a new one is created and
this could end up with a lot of objects to be collect by GC.

This could be improved using some techniques like adding correctly equals/hashcode, using caching.
