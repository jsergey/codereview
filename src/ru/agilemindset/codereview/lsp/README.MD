### Liskov Substitution Principle (LSP)

Functions that use references to base classes must be able to use objects of derived classes without knowing it.

One easy way to spot violations of this principle is to look for explicit casting. If you have to cast a object to some type, you are not using the base class without knowledge of the derived classes.