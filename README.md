# About
``list-class`` is tiny data structure similar to ArrayDeque. It's a bit slower, but uses less memory than speed-optimized version.
At the moment, class only works with integers.

What can you do with ``list-class``:
- Get values of your list in O(n) time.
- Add an element to the last in O(n) time.
- Get an element from the last in O(n) time.
- Add an element to the first.
- Get an element from the first in O(1) time.
- Remove element from the first in O(n) time.
- Remove element from the last in O(1) time.

# Usage
Just clone repository with 

```
git clone https://github.com/getsadzeg/list-class.git
```
Now copy folder named 'list' to your project and access it's classes via:

```java
import list.lib.*;
```

After that you can create List object(more is demonstrated in Main.java):

```java
List list = new List(100);
```

# Feel free to fork

You can fork, modify and change the code under MIT license. The project contains LICENSE file to see full license description.
