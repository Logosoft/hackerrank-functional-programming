# HackerRank Functional Programming 

[![HackerRank logo](https://hrcdn.net/fcore/assets/brand/h_mark_sm-966d2b45e3.svg)](https://www.hackerrank.com) 

Complete collection of solutions to [HackerRank](https://www.hackerrank.com) practice problems in [Functional Programming](https://www.hackerrank.com/domains/fp).

All the code tested with Scala version 2.13.1.

All test cases passed. 

![Scala version](https://img.shields.io/badge/scala-2.13.1-brightgreen)
![Test passing](https://img.shields.io/badge/test-passing-brightgreen)

## Index

- [Introduction](#Introduction)
- [Recursion](#Recursion)
- [Functional Structures](#Functional-Structures)
- [Memoization and DP](#Memoization-and-DP)
- [Persistent Structures](#Persistent-Structures)
- [Ad Hoc](#Ad-Hoc)
- [Parsers](#Parsers)
- [Interpreter and Compilers](#Interpreter-and-Compilers)

### Introduction

| Problem | Solution |
| :--- | :---: |
| [Solve Me First FP](https://www.hackerrank.com/challenges/fp-solve-me-first/problem) | [Scala](src/main/introduction/fp_solve_me_first/Solution.scala) |
| [Hello World](https://www.hackerrank.com/challenges/fp-hello-world/problem) | [Scala worksheet](src/main/introduction/hello_world/Solution.sc) |
| [Hello World N Times](https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem) | [Scala worksheet](src/main/introduction/hello_world_n_times/Solution.sc) |
| [List Replication](https://www.hackerrank.com/challenges/fp-list-replication/problem) | [Scala worksheet](src/main/introduction/fp_list_replication/Solution.sc) |
| [Filter Array](https://www.hackerrank.com/challenges/fp-filter-array/problem) | [Scala worksheet](src/main/introduction/fp_filter_array/Solution.sc) |
| [Filter Positions in a List](https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem) | [Scala worksheet](src/main/introduction/fp_filter_positions_in_a_list/Solution.sc) |
| [Array Of N Elements](https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem) | [Scala worksheet](src/main/introduction/fp_array_of_n_elements/Solution.sc) |
| [Reverse a List](https://www.hackerrank.com/challenges/fp-reverse-a-list/problem) | [Scala worksheet](src/main/introduction/fp_reverse_a_list/Solution.sc) |
| [Sum of Odd Elements](https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem) | [Scala worksheet](src/main/introduction/fp_sum_of_odd_elements/Solution.sc) |
| [List Length](https://www.hackerrank.com/challenges/fp-list-length/problem) | [Scala worksheet](src/main/introduction/fp_list_length/Solution.sc) |
| [Update List](https://www.hackerrank.com/challenges/fp-update-list/problem) | [Scala worksheet](src/main/introduction/fp_update_list/Solution.sc) |
| [Evaluating e^x](https://www.hackerrank.com/challenges/eval-ex/problem) | [Scala](src/main/introduction/eval_ex/Solution.scala) |
| [Area Under Curves and Volume of Revolving a Curve](https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv/problem) | [Scala worksheet](src/main/introduction/area_under_curves_and_volume_of_revolving_a_curv/Solution.sc) |
| [Lambda Calculus - Reductions #1](https://www.hackerrank.com/challenges/lambda-calculus-reductions-1/problem) | [Text](src/main/introduction/lambda_calculus_reductions_1/Solution.txt) |
| [Lambda Calculus - Reductions #2](https://www.hackerrank.com/challenges/lambda-calculus-reductions-2/problem) | [Text](src/main/introduction/lambda_calculus_reductions_2/Solution.txt) |
| [Lambda Calculus - Reductions #3](https://www.hackerrank.com/challenges/lambda-calculus-reductions-3/problem) | [Text](src/main/introduction/lambda_calculus_reductions_3/Solution.txt) |
| [Lambda Calculus - Reductions #4](https://www.hackerrank.com/challenges/lambda-calculus-reductions-4/problem) | [Text](src/main/introduction/lambda_calculus_reductions_4/Solution.txt) |
| [Lambda Calculus - Evaluating Expressions #1](https://www.hackerrank.com/challenges/lambda-calculus-getting-started/problem) | [Text](src/main/introduction/lambda-calculus-getting_started/Solution.txt) |
| [Lambda Calculus - Evaluating Expressions #2](https://www.hackerrank.com/challenges/lambda-calculus-understanding-the-syntax/problem) | [Text](src/main/introduction/lambda_calculus_understanding_the_syntax/Solution.txt) |
| [Lambda Calculus - Evaluating Expressions #3](https://www.hackerrank.com/challenges/lambda-calculus-evaluate-the-expression/problem) | [Text](src/main/introduction/lambda_calculus_evaluate-the_expression/Solution.txt) |
| [Lambda Calculus - Evaluating Expressions #4](https://www.hackerrank.com/challenges/lambda-calculus-evaluate-the-expression-1/problem) | [Text](src/main/introduction/lambda_calculus_evaluate_the_expression_1/Solution.txt) |
| [Lambda Calculus - Evaluating Expressions #5](https://www.hackerrank.com/challenges/lambda-calculus-evaluate-the-expression-2/problem) | [Text](src/main/introduction/lambda_calculus_evaluate_the_expression_2/Solution.txt) |
| [Functions or Not?](https://www.hackerrank.com/challenges/functions-or-not/problem) | [Scala](src/main/introduction/functions_or_not/Solution.scala) |
| [Compute the Perimeter of a Polygon](https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon/problem) | [Scala](src/main/introduction/lambda_march_compute_the_perimeter_of_a_polygon/Solution.scala) |
| [Compute the Area of a Polygon](https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem) | [Scala](src/main/introduction/lambda_march_compute_the_area_of_a_polygon/Solution.scala) |
  
### Recursion

| Problem | Solution |
| :--- | :---: |
| [Computing the GCD](https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem) | [Scala](src/main/recursion/functional_programming_warmups_in_recursion___gcd/Solution.scala) |
| [Fibonacci Numbers](https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem) | [Scala](src/main/recursion/functional_programming_warmups_in_recursion___fibonacci_numbers/Solution.scala) |
| [Pascal's Triangle](https://www.hackerrank.com/challenges/pascals-triangle/problem) | [Scala](src/main/recursion/pascals_triangle/Solution.scala) |
| [Functions and Fractals: Sierpinski triangles](https://www.hackerrank.com/challenges/functions-and-fractals-sierpinski-triangles/problem) | [Scala](src/main/recursion/functions_and_fractals_sierpinski_triangles/Solution.scala) |
| [String Mingling](https://www.hackerrank.com/challenges/string-mingling/problem) | [Scala](src/main/recursion/string_mingling/Solution.scala) |
| [String-o-Permute](https://www.hackerrank.com/challenges/string-o-permute/problem) | [Scala](src/main/recursion/string_o_permute/Solution.scala) |
| [Functions and Fractals - Recursive Trees](https://www.hackerrank.com/challenges/fractal-trees/problem) | [Scala](src/main/recursion/fractal_trees/Solution.scala) |
| [Convex Hull](https://www.hackerrank.com/challenges/convex-hull-fp/problem) | [Scala](src/main/recursion/convex_hull_fp/Solution.scala) |
| [String Compression](https://www.hackerrank.com/challenges/string-compression/problem) | [Scala](src/main/recursion/string_compression/Solution.scala) |
| [Crosswords-101](https://www.hackerrank.com/challenges/crosswords-101/problem) | [Scala](src/main/recursion/crosswords_101/Solution.scala) |
| [Prefix Compression](https://www.hackerrank.com/challenges/prefix-compression/problem) | [Scala](src/main/recursion/prefix_compression/Solution.scala) |
| [String Reductions](https://www.hackerrank.com/challenges/string-reductions/problem) | [Scala](src/main/recursion/string_reductions/Solution.scala) |
| [Super-Queens on a Chessboard](https://www.hackerrank.com/challenges/super-queens-on-a-chessboard/problem) | [Scala](src/main/recursion/super_queens_on_a_chessboard/Solution.scala) |
| [The Sums of Powers](https://www.hackerrank.com/challenges/functional-programming-the-sums-of-powers/problem) | [Scala](src/main/recursion/functional_programming_the_sums_of_powers/Solution.scala) |
| [Sequence full of colors](https://www.hackerrank.com/challenges/sequence-full-of-colors/problem) | [Scala](src/main/recursion/sequence_full_of_colors/Solution.scala) |
| [Filter Elements](https://www.hackerrank.com/challenges/filter-elements/problem) | [Scala](src/main/recursion/filter_elements/Solution.scala) |
| [Super Digit](https://www.hackerrank.com/challenges/super-digit/problem) | [Scala](src/main/recursion/super_digit/Solution.scala) |
| [The Tree Of Life](https://www.hackerrank.com/challenges/the-tree-of-life/problem) | [Scala](src/main/recursion/the_tree_of_life/Solution.scala) |
| [Concave Polygon](https://www.hackerrank.com/challenges/lambda-march-concave-polygon/problem) | [Scala](src/main/recursion/lambda_march_concave_polygon/Solution.scala) |

### Functional Structures

| Problem | Solution |
| :--- | :---: |
| [Swap Nodes](https://www.hackerrank.com/challenges/swap-nodes/problem) | [Scala](src/main/functional_structures/swap_nodes/Solution.scala) |
| [Matrix Rotation](https://www.hackerrank.com/challenges/matrix-rotation/problem) | [Scala](src/main/functional_structures/matrix_rotation/Solution.scala) |
| [Valid BST](https://www.hackerrank.com/challenges/valid-bst/problem) | [Scala](src/main/functional_structures/valid_bst/Solution.scala) |
| [Lists and GCD](https://www.hackerrank.com/challenges/lists-and-gcd/problem) | [Scala](src/main/functional_structures/lists_and_gcd/Solution.scala) |
| [Prison Transport](https://www.hackerrank.com/challenges/prison-transport/problem) | [Scala](src/main/functional_structures/prison_transport/Solution.scala) |
| [Substring Searching](https://www.hackerrank.com/challenges/kmp-fp/problem) | [Scala](src/main/functional_structures/kmp_fp/Solution.scala) |
| [Order exercises](https://www.hackerrank.com/challenges/order-exercises/problem) | [Scala](src/main/functional_structures/order_exercises/Solution.scala) |
| [John and Fences](https://www.hackerrank.com/challenges/john-and-fences/problem) | [Scala](src/main/functional_structures/john_and_fences/Solution.scala) |
| [Range Minimum Query](https://www.hackerrank.com/challenges/range-minimum-query/problem) | [Scala](src/main/functional_structures/range_minimum_query/Solution.scala) |
| [Stock Prediction](https://www.hackerrank.com/challenges/stocks-prediction/problem) | [Scala](src/main/functional_structures/stocks_prediction/Solution.scala) |
| [Mirko at the Construction Site](https://www.hackerrank.com/challenges/mirko-at-construction-site/problem) | [Scala](src/main/functional_structures/mirko_at_construction_site/Solution.scala) |
| [Tree manager](https://www.hackerrank.com/challenges/tree-manager/problem) | [Scala](src/main/functional_structures/tree_manager/Solution.scala) |
| [Fighting Armies](https://www.hackerrank.com/challenges/fighting-armies/problem) | [Scala](src/main/functional_structures/fighting_armies/Solution.scala) |

### Memoization and DP

| Problem | Solution |
| :--- | :---: |
| [Number of Binary Search Tree](https://www.hackerrank.com/challenges/number-of-binary-search-tree/problem) | [Scala](src/main/memoization_and_dp/number_of_binary_search_tree/Solution.scala) |
| [Pentagonal Numbers](https://www.hackerrank.com/challenges/pentagonal-numbers/problem) | [Scala](src/main/memoization_and_dp/pentagonal_numbers/Solution.scala) |
| [Bitter Chocolate](https://www.hackerrank.com/challenges/bitter-chocolate/problem) | [Scala](src/main/memoization_and_dp/bitter_chocolate/Solution.scala) |
| [Fibonacci](https://www.hackerrank.com/challenges/fibonacci-fp/problem) | [Scala](src/main/memoization_and_dp/fibonacci_fp/Solution.scala) |
| [Reverse Factorization](https://www.hackerrank.com/challenges/reverse-factorization/problem) | [Scala](src/main/memoization_and_dp/reverse_factorization/Solution.scala) |
| [Different Ways](https://www.hackerrank.com/challenges/different-ways-fp/problem) | [Scala](src/main/memoization_and_dp/different_ways_fp/Solution.scala) |
| [Dice Path](https://www.hackerrank.com/challenges/dice-path/problem) | [Scala](src/main/memoization_and_dp/dice_path/Solution.scala) |
| [Bangalore Bank](https://www.hackerrank.com/challenges/bangalore-bank/problem) | [Scala](src/main/memoization_and_dp/bangalore_bank/Solution.scala) |
| [Sherlock and the Maze](https://www.hackerrank.com/challenges/sherlock-and-the-maze/problem) | [Scala](src/main/memoization_and_dp/sherlock_and_the_maze/Solution.scala) |
| [Password Cracker FP](https://www.hackerrank.com/challenges/password-cracker-fp/problem) | [Scala](src/main/memoization_and_dp/password_cracker_fp/Solution.scala) |
| [Expressions](https://www.hackerrank.com/challenges/expressions/problem) | [Scala](src/main/memoization_and_dp/expressions/Solution.scala) |
| [Klotski](https://www.hackerrank.com/challenges/klotski/problem) | [Scala](src/main/memoization_and_dp/klotski/Solution.scala) |

### Persistent Structures

| Problem | Solution |
| :--- | :---: |
| [Minimum Multiple](https://www.hackerrank.com/challenges/minimum-multiple/problem) | [Scala](src/main/persistent_structures/minimum_multiple/Solution.scala) |
| [Messy Medians](https://www.hackerrank.com/challenges/messy-medians/problem) | [Scala](src/main/persistent_structures/messy_medians/Solution.scala) |
| [Boleyn Salary](https://www.hackerrank.com/challenges/boleyn-salary/problem) | [Scala](src/main/persistent_structures/boleyn_salary/Solution.scala) |

### Ad Hoc

| Problem | Solution |
| :--- | :---: |
| [Jumping Bunnies](https://www.hackerrank.com/challenges/jumping-bunnies/problem) | [Scala](src/main/ad_hoc/jumping_bunnies/Solution.scala) |
| [Rotate String](https://www.hackerrank.com/challenges/rotate-string/problem) | [Scala](src/main/ad_hoc/rotate_string/Solution.scala) |
| [Remove Duplicates](https://www.hackerrank.com/challenges/remove-duplicates/problem) | [Scala](src/main/ad_hoc/remove_duplicates/Solution.scala) |
| [Huge GCD](https://www.hackerrank.com/challenges/huge-gcd-fp/problem) | [Scala](src/main/ad_hoc/huge_gcd_fp/Solution.scala) |
| [Kundu And Bubble Wrap](https://www.hackerrank.com/challenges/kundu-and-bubble-wrap/problem) | [Scala](src/main/ad_hoc/kundu_and_bubble_wrap/Solution.scala) |
| [Missing Numbers (FP)](https://www.hackerrank.com/challenges/missing-numbers-fp/problem) | [Scala](src/main/ad_hoc/missing_numbers_fp/Solution.scala) |
| [Common Divisors](https://www.hackerrank.com/challenges/common-divisors/problem) | [Scala](src/main/ad_hoc/common_divisors/Solution.scala) |
| [Mangoes](https://www.hackerrank.com/challenges/mango/problem) | [Scala](src/main/ad_hoc/mango/Solution.scala) |
| [Game of Kyles](https://www.hackerrank.com/challenges/game-of-kyles/problem) | [Scala](src/main/ad_hoc/game_of_kyles/Solution.scala) |
| [Subset Sum](https://www.hackerrank.com/challenges/subset-sum/problem) | [Scala](src/main/ad_hoc/subset_sum/Solution.scala) |
| [Elementary Watson](https://www.hackerrank.com/challenges/elementary-watson/problem) | [Scala](src/main/ad_hoc/elementary_watson/Solution.scala) |
| [Captain Prime](https://www.hackerrank.com/challenges/captain-prime/problem) | [Scala](src/main/ad_hoc/captain_prime/Solution.scala) |
| [Puzzle and PC](https://www.hackerrank.com/challenges/puzzle-and-pc/problem) | [Scala](src/main/ad_hoc/puzzle_and_pc/Solution.scala) |
| [\[Approximate Challenge\] Convolutional Coding](https://www.hackerrank.com/challenges/convolutional-coding/problem) | [Scala](src/main/ad_hoc/convolutional_coding/Solution.scala) |

### Parsers

| Problem | Solution |
| :--- | :---: |
| [Expressions V2](https://www.hackerrank.com/challenges/expressions-v2/problem) | [Scala](src/main/parsers/expressions_v2/Solution.scala) |
| [Simplify the Algebraic Expressions](https://www.hackerrank.com/challenges/simplify-the-algebraic-expressions/problem) | [Scala](src/main/parsers/simplify_the_algebraic_expressions/Solution.scala) |

### Interpreter and Compilers

| Problem | Solution |
| :--- | :---: |
| [While Language](https://www.hackerrank.com/challenges/while-language-fp/problem) | [Scala](src/main/interpreter_and_compilers/while_language_fp/Solution.scala) |
| [Intuitive language](https://www.hackerrank.com/challenges/intuitive-language/problem) | [Scala](src/main/interpreter_and_compilers/intuitive_language/Solution.scala) |
| [Down With Abstractions](https://www.hackerrank.com/challenges/down-with-abstractions/problem) | [Scala](src/main/interpreter_and_compilers/down_with_abstractions/Solution.scala) |
| [Infer](https://www.hackerrank.com/challenges/infer/problem) | [Scala](src/main/interpreter_and_compilers/infer/Solution.scala) |
| [BrainF__k interpreter](https://www.hackerrank.com/challenges/brainf-k-interpreter-fp/problem) | [Scala](src/main/interpreter_and_compilers/brainf_k_interpreter_fp/Solution.scala) |

## Author

<a href="https://www.linkedin.com/in/oleg-oleshchuk/" target="_blank">Oleg Oleshchuk</a>

## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- [MIT license](http://opensource.org/licenses/mit-license.php)
- Copyright 2019 © <a href="https://www.linkedin.com/in/oleg-oleshchuk/" target="_blank">Oleg Oleshchuk</a>.