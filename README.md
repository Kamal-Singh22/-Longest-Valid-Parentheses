# -Longest-Valid-Parentheses
Given a string s containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
Explanation:
Initialization:

We use a stack to store indices of characters.
We push -1 onto the stack as a base index to calculate lengths.
Iteration:

For each character in the string:
If it is '(', push its index onto the stack.
If it is ')', pop the top of the stack.
If the stack is empty after popping, push the current index as the new base.
Otherwise, the valid substring length is the difference between the current index and the index now on top of the stack.
Result:

The maximum length recorded is the length of the longest valid parentheses substring....
