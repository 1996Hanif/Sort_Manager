<h1 align ="center">Sort Manager</h1>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-program">About The Program</a></li>
    <li><a href="#how-to-use">How to Use</a></li>
    <li><a href="#sorting-algorithms-used">Sorting Algorithms Used</a>
      <ul>
        <li><a href="#binary-tree">Binary Tree</a></li>
        <li><a href="#bubble-sort">Bubble Sort</a></li>
        <li><a href="#instertion-sort">Insertion Sort</a></li>
        <li><a href="#merge-sort">Merge Sort</a></li>
        <li><a href="#quick-sort">Quick Sort</a></li>
        <li><a href="#selection-sort">Selection Sort</a></li>
      </ul>
    </li>
    <li><a href="#references">References</a></li>
  </ol>
</details>


## About The Program

The purpose of this program is to sort a number of random numbers given by the user. The program consists of 6 different sorting algorithm, each have their own special way to sorting a list of numbers. The user is allowed to pick the amount of numbers he/she wants sorted and choose which sorting algorithm he/she wants to sort it with, the program will then return a list of random numbers based on the amount given by the user, a sorted version the same list, the sorting algorithm used and the time taken to do the sorting

## How To Use 

### Installation

1. Copy this link https://github.com/1996Hanif/Sort_Manager.
2. Open Git Bash
3. Change your current working directory to the location where you want the cloned directory to be placed.
4. In Git Bash type git clone followed by the URL you copied earlier.
5. Now press Enter and you should have created a local clone.

### How to Use Program

1. Run The Program
2. You will be asked to choose the sorting method to want to use, enter the number correlating with the sort method (1-6) followed by ENTER
3. You will then be asked to enter the amount of numbers you want to be sorted, enter any number above 0 followed by ENTER
4. Now you should recieve the sort method chose, a list of numbers, a sort list of number done by the chosen sort method and the time taken by the sort algorithm
5. In order to repeat the program enter Y followed by ENTER, to stop the program press Enter

## Sorting Algorithms Used

### Binary Tree

A binary tree is a rooted binary tree data structure whose internal nodes each store a key greater than all the keys in the node’s left subtree and less than those in its right subtree. A binary tree is a type of data structure for storing data such as numbers in an organized way.
![360px-Binary_search_tree svg](https://user-images.githubusercontent.com/15141836/146362515-c9443794-c375-484e-9c37-89db8fce755a.png)

### Bubble Sort
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list.

![Bubble-sort-example-300px](https://user-images.githubusercontent.com/15141836/146362904-ec3d839c-6734-4579-81db-aa46edb6e090.gif)

### Insertion Sort
Insertion sort iterates, consuming one input element each repetition, and grows a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.
![Insertion-sort-example-300px](https://user-images.githubusercontent.com/15141836/146363550-87dcbb5a-2953-426e-887a-d5964b55f57b.gif)

### Merge Sort
Conceptually, a merge sort works as follows:
1. Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).
2. Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.

![Merge-sort-example-300px](https://user-images.githubusercontent.com/15141836/146363814-6738bbab-3561-42b8-8680-2fcfb3f61c48.gif)

### Quick Sort
Quicksort is a sorting algorithm based on the divide and conquer approach where
1. An array is divided into subarrays by selecting a pivot element (element selected from the array).
2. While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
3. The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.
4. At this point, elements are already sorted. Finally, elements are combined to form a sorted array.

![Quicksort-example](https://user-images.githubusercontent.com/15141836/146364671-e0596e48-3647-4b92-a1f3-6e33f2c98432.gif)

### Selection Sort
Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.

<img src="https://user-images.githubusercontent.com/15141836/146365047-1f03b1e7-54a4-41e6-9811-123296817858.gif " width="250">

## References
- https://en.wikipedia.org/wiki/Binary_search_tree
- https://en.wikipedia.org/wiki/Bubble_sort
- https://en.wikipedia.org/wiki/Merge_sort
- https://en.wikipedia.org/wiki/Insertion_sort
- https://www.programiz.com/dsa/quick-sort
- https://www.programiz.com/dsa/selection-sort
