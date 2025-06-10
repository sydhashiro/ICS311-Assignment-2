# ʻŌlelo Noʻeau Dictionary – Balanced Tree Implementation

#### ICS 311 - Assignment 2: Balanced Trees
#### Sydney Hashiro
#### Ka'ili Benavente

## Project Overview

This project implements a searchable, ordered dictionary of Hawaiian sayings using a balanced binary search tree.
Each saying includes:
- A Hawaian phrase
- Its English translation
- Explanations in both Hawaiian and English

This dictionary allows efficient insertions, lookups, and word based searches in both languages

## Data Structure and Design

We uesed a Java `TreeSet<Saying>` for our core storage structure. This is backed by a **Red-Black Tree**, providing:
| Operation        | Time Complexity |
|------------------|------------------|
| Insert           | O(log n)         |
| Search (member)  | O(log n)         |
| Predecessor/Successor | O(log n)   |
| Word search (`meHua`, `withWord`) | O(n · w) — linear scan by word |

The `Saying` class implements `Comparable` to allow Unicode-aware sorting by the Hawaiian phrase. Word-based searches are done by splitting the text and comparing individual words.

## Work Division

### Sydney Hashiro
- Implemented `Saying.java`:
  - Fields: Hawaiian phrase, English translation, explanations
  - `compareTo`, `equals`, `hashCode` for sorting & deduplication
- Implemented `BalancedTreeDictionary.java`:
  - Methods: `insert()`, `member()`, `first()`, `last()`, `predecessor()`, `successor()`
  - Utilizes Java’s `TreeSet` for balanced ordering

### Ka'ili Benavente
- Implemented:
  - `meHua(word)` – finds sayings containing a Hawaiian word
  - `withWord(word)` – finds sayings containing an English word
- Created `Main.java`:
  - Populated the dictionary with sample data
  - Ran all test cases and printed output
- Verified functional correctness of all methods

## Features Implemented
- Insert sayings into a balanced tree
- Search for sayings by exact Hawaiian phrase
- Retrieve first, last, predecessor, and successor in alphabetical order
- Search sayings by Hawaiian or English word (substring match)

## Sample Output
- Ua ola loko i ke aloha = Love gives life within.
- I ola no ke kino i ka mā‘ona o ka ‘ōpū = The body enjoys health when the stomach is well filled.
- I pa‘a ke kino o ke keiki i ka lā‘au = That the body of the child be solidly built by the medicines.
- Ka lā i ka Mauliola = The sun at the source of life.
- Mai ka piko o ke po‘o a ka poli o ka wāwae, a l’a ma na kihi ‘ehā o ke kino = From the crown of the head to the soles of the feet, and the four corners of the body.
- Pū‘ali kalo i ka we ‘ole = Taro, for lack of water, grows misshapen.