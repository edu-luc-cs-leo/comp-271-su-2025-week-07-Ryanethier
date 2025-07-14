# Week 4 Reflection: Queue and Stack Classes

After comparing my implementations of `Queue` and `Stack` to the solutions, I noticed several similarities in overall logic but some stylistic and structural differences. 

Functionally, I believe both versions correctly follow the FIFO and LIFO principles defined in our interfaces and override necessary interface methods. However, my code included more detailed method-level comments and custom `toString()` implementations to help me visualize the internal structure, showing elements from front to back or top to bottom. In contrast, the solution `toString()` simply calls the inherited method, which shows that the `toString()` in `DynamicArray` was already well defined. This was a bit of an overlook on my part, for brevity and simplicity I think it would have been better to just call the `toString()` method instead of creating a custom method.

Another difference I saw is how elements are accessed: I used `getElement(0)` with several conditional checks, while the solution used a cleaner `getFirst()` method, a helper method from `DynamicArray`. This made me realize that I may be overcomplicating things by not fully leveraging the inherited utilities. 

Overall, I’m proud of the clarity and readability of my code, but I learned that writing more concise code and trusting well-designed helper methods can lead to simpler, more elegant solutions. In the future, I’ll aim to balance my thoroughness with simplicity and better reuse of inherited methods, improve my habit of over-complicating my solutions, and try to find more intuitve ways of solving the problems.
