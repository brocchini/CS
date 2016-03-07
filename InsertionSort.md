## Insert Sort

### Input : A sequence of numbers `(a1, a2, a3, ... , an)`

__Example__ a sequence of 7 numbers, let's call it `seqA` :

|  1  |  2  |  3  |  4  |  5  |   6 |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  9  |  5  |  6  |  1  |  10 |   4 |  2  |


### Output: The permutation of the input `(b1, b2,b3, ..., bn)` where `b1 <= b2 <= b3 <= ... <= bn`


__After sorting `seqA` we get__:

|  1  |  2  |  3  |  4  |  5  |  6  |   7 |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  1  |  2  |  4  |  5  |  6  |  9  | 10  |



### Algorithm:

Start splitting the sequence into 2 sequences by braking at the 2nd element:

| 1   | ` ` |  2  |  3  |  4  |  5  |  6  |  7  |
|:---:| --- |:---:|:---:|:---:|:---:|:---:|:---:|
|  9  | ` ` |  5  |  6  |  1  |  10 |  4  |  2  |


Now, take each element from the right sequence call it `key` and compare with each element in the left sequence, from right to left, we swap positions between the key and left elements until we find a left element that is not smaller than the key or there are no more elements to scan.

We will use an index variable `i` to iterate to the right, from 2 to 7 (length of `seqA`).

We will the index variable `left` to iterate to the left of `i`, from `(i-1)` to 1

We scan to the left looking for the insertion position by decrementing `left` while `key < seqA[left]  and left>0 `

__Step 1 :__
```
i <- 2
left <- (i - 1) // left <- 2 - 1
key <- seqA[i] // key <- 5
```

| 1   | ` ` |  2  |  3  |  4  |  5  |  6  |  7  |
|:---:| --- |:---:|:---:|:---:|:---:|:---:|:---:|
|  9  | ` ` | `5` |  6  |  1  |  10 |  4  |  2  |

```
left iteration 1 : // left <- 1
  while ( key < seqA[left]  and left>0 ) do
    //5 < 9  = true && 1>0 = true
    seqA[left+1] <- seqA[left] // seqA[2] <- 9
    left <- left - 1
  //left=0, so no more elements to compare, so we found the insertion spot at seqA[1].
  seqA[left+1] <- key          // seqA[1] <- 5
```

| 1   |  2   | ` ` |  3  |  4  |  5  |  6  |  7  |
|:---:| :---:|:---:|:---:|:---:|:---:|:---:|:---:|
| `5` | `9`  | ` ` |  6  |  1  |  10 |  4  |  2  |


__Step 2 :__
```
i <- i + 1 = 3
left <- i - 1
key <- seqA[3] = 6

left iteration 1: // left <- 2 
  while ( key < seqA[left] and left>0 ) do
    // 6 < 9 = true && 2 > 0 = true
    seqA[left+1] <- seqA[left] // seqA[3] <- 9
    left <- left - 1           // left <- 1
```
| 1   |  2  | ` ` |  3  |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  5  | `9` | ` ` | `9` |  1  |  10 |  4  |  2  |

```
left iteration 2: //left = 1
  while ( key < seqA[left] and left>0 ) do
    //6 < 5 ? = false && 1 > 0 = true
  //Exit while  because 6 < 5 = false
```

` seqA[left+1] <- key      // seqA[2] <- 6`

| 1   |  2  | ` ` |  3  |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  5  | `6` | ` ` | `9` |  1  |  10 |  4  |  2  |


__Step 3 :__
```
i <-  i + 1 // i <- 4
left <- i - 1  
key <- seqA[4] // key <- 1
```
| 1   |  2  |  3  | ` ` |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  5  |  6  |  9  | ` ` |  1  |  10 |  4  |  2  |


```
left iteration 1: // left <- 3
  while ( key < seqA[left] and left>0 ) do
    //1 < 9 = true && 3 > 0 = true
    seqA[left+1] <- seqA[left] // seqA[4] <- 9
    left <- left - 1           // left <- 2
```
| 1   |  2  |  3  | ` ` |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  5  |  6  | 9   | ` ` | `9` |  10 |  4  |  2  |



```
left iteration 2: // left <- 2 
  while ( key < seqA[left] and left>0 ) do
    // 1 < 6 = true && 2 > 0 = true
    seqA[left+1] = seqA[left] // seqA[3] <- 6
    left <- left - 1           // left <- 1
```
| 1   |  2  |  3  | ` ` |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  5  |  6  | `6` | ` ` |  9  |  10 |  4  |  2  |


```
left iteration 3: left = 1
  while ( key < seqA[left] and left>0 ) do
    // 1 < 5 = true && 1 > 0 = true
    seqA[left+1] <- seqA[left] // seqA[2] <- 5
    left <- left - 1           // left <- 0
    // Exit while  because left>0 = false
```

| 1   |  2  |  3  | ` ` |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|  5  | `5` |  6  | ` ` |  9  |  10 |  4  |  2  |

` seqA[left+1] <- key          // seqA[1] <- 1`

| 1   |  2  |  3  | ` ` |  4  |  5  |  6  |  7  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| `1` |  5  |  6  | ` ` |  9  |  10 |  4  |  2  |
