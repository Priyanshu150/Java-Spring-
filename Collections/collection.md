# Java Collection Framework

## 1. What is the Java Collection Framework?

- Added in Java version **1.2**
- A collection is a group of objects
- Present in the `java.util` package
- The framework provides an architecture to manage groups of objects — add, update, delete, search, etc.

## 2. Why Do We Need the Java Collection Framework?

- Prior to JCF, Java had Arrays, Vectors, and HashTables
- The problem was there was **no common interface**, making it difficult to remember methods for each data structure
- JCF solved this by providing a unified architecture with consistent interfaces

![Collection Framework Hierarchy](Images/image.png)

![Collection Framework Hierarchy (extended)](Images/image-1.png)

## 3. Iterable

- The root interface of the collection hierarchy
- Any class that implements `Iterable` can be used in a for-each loop

![Iterable](Images/image-2.png)

## 4. Collection Interface

Represents a group of objects. It's an interface that provides methods to work on groups of objects.

![Collection Interface](Images/image-4.png)

**Q. If `Iterable` and `Collection` are interfaces, how can they provide concrete method implementations?**

There are 3 ways this can be achieved:

1. **Abstract classes in the middle** — e.g., `AbstractList`, `AbstractSet`

   ![Abstract classes](Images/image-5.png)

2. **Default methods in interfaces** (Java 8+)

3. **Static methods in interfaces** (Java 8+)

## 5. Collection vs Collections

| | `Collection` | `Collections` |
|---|---|---|
| **Type** | Interface | Utility class |
| **Purpose** | Defines the core contract for data structures like `ArrayList`, `Stack`, `LinkedList` | Provides static utility methods to operate on collections |
| **Examples** | `add()`, `remove()`, `size()` | `sort()`, `swap()`, `search()`, `reverse()`, `copy()` |

## 6. Queue

- Follows **FIFO** (First In, First Out) ordering
- Elements are inserted at the tail and removed from the head

![Queue](Images/image-6.png)

## 7. PriorityQueue (MinHeap and MaxHeap)

- Elements are ordered by their **natural ordering** or by a `Comparator`
- Default is a **min-heap** (smallest element at the head)
- For a **max-heap**, provide a reverse comparator: `new PriorityQueue<>(Collections.reverseOrder())`

## 8. Comparator vs Comparable

Both provide a way to sort a collection of objects.

![Comparator vs Comparable](Images/image-7.png)

| | `Comparable` | `Comparator` |
|---|---|---|
| **Package** | `java.lang` | `java.util` |
| **Method** | `compareTo(Object o)` | `compare(Object o1, Object o2)` |
| **Modifies original class?** | Yes | No |
| **Use case** | Natural/default ordering | Custom/multiple orderings |

## 9. Deque

- **Double-ended queue** — supports insertion and removal at both ends
- Can be used as both a **stack** and a **queue**

![Deque](Images/image-8.png)

## 10. ArrayDeque

- A concrete class that implements both `Queue` and `Deque` interfaces
- Backed by a resizable array
- Generally faster than `LinkedList` for stack/queue use cases

## 11. Thread-Safe Versions of PriorityQueue and ArrayDeque

![Thread-safe queue variants](Images/image-9.png)

## 12. List

- An **ordered** collection of objects
- **Duplicate values** are allowed
- Supports index-based access

![List](Images/image-10.png)
![List](Images/image-11.png)
![List](Images/image-12.png)
![List](Images/image-13.png)

## 13. LinkedList

- Implements both `Deque` and `List` interfaces
- Supports Deque methods: `getFirst()`, `getLast()`, `removeFirst()`, etc.
- Supports index-based operations: `get(index)`, `add(index, object)`, etc.

![LinkedList](Images/image-14.png)

## 14. Vector

- Similar to `ArrayList` but **thread-safe** (all methods are synchronized)
- Legacy class; prefer `ArrayList` with explicit synchronization or `CopyOnWriteArrayList` in modern code

![Vector](Images/image-15.png)

## 15. Stack

- Extends `Vector` and follows **LIFO** (Last In, First Out) ordering
- Legacy class; prefer `ArrayDeque` as a stack in modern code

![Stack](Images/image-16.png)
![Stack methods](Images/image-17.png)

## 16. Map

- Stores data as **key-value pairs**
- Keys must be unique; values can be duplicated

![Map](Images/image-18.png)
![Map](Images/image-19.png)

## 17. HashMap

- Allows **one `null` key** and multiple `null` values (unlike `HashTable`)
- Does **not** maintain insertion order
- **Not thread-safe** — use `ConcurrentHashMap` or `HashTable` for thread-safe alternatives

## 18. LinkedHashMap

- Extends `HashMap` and also uses a **doubly linked list**
- Can maintain either:
  - **Insertion order** (default)
  - **Access order** (set via constructor flag)

![LinkedHashMap](Images/image-20.png)

## 19. TreeMap

- Entries are sorted by the **natural ordering of keys** or by a `Comparator` provided at creation time
- Internally backed by a **Red-Black tree** (self-balancing binary search tree)
- Does **not** allow `null` keys

## 20. SortedMap

- Extends `Map` and guarantees keys are in **sorted order**

![SortedMap](Images/image-21.png)

## 21. NavigableMap

- Extends `SortedMap` with navigation methods like `lowerKey()`, `floorKey()`, `ceilingKey()`, `higherKey()`
- `TreeMap` is the primary implementation

![NavigableMap](Images/image-22.png)
![NavigableMap methods](Images/image-23.png)
![NavigableMap methods](Images/image-24.png)

## 22. Set

- A collection that **does not allow duplicate elements**
- Models the mathematical set abstraction

![Set](Images/image-25.png)
![Set](Images/image-26.png)

## 23. HashSet

- Internally backed by a `HashMap<E, Object>`
- On `add(element)`, it calls `map.put(element, DUMMY_OBJECT)`
- **No guaranteed order** of elements
- **Not thread-safe** — use `ConcurrentHashMap.newKeySet()` for a thread-safe set

Key concepts to know:
- What happens when two values get the same hash? → **Hash collision**, handled via chaining or open addressing
- What is the **load factor**? → Default is `0.75`; controls when the map resizes

![HashSet](Images/image-27.png)

## 24. LinkedHashSet

- Internally backed by a `LinkedHashMap`
- Maintains **insertion order**
- **Not thread-safe** — for a thread-safe version:

```java
Set<Integer> set = Collections.synchronizedSet(new LinkedHashSet<>());
```

## 25. TreeSet

- Internally backed by a `TreeMap`
- Elements are stored in **sorted (natural) order**
- Does **not** allow `null` values