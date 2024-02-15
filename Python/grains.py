# To solve this challenge, you can create a function that calculates the number of grains on a given square ,
# and another function to calculate the total number of grains on the entire chessboard.

# Here's a Python implementation:

# ```python
def grains_on_square(square):
    """
    Calculate the number of grains on a given square.
    """
    if not 1 <= square <= 64:
        raise ValueError("Square number must be between 1 and 64.")
    return 2 ** (square - 1)

def total_grains_on_board():
    """
    Calculate the total number of grains on the entire chessboard.
    """
    total_grains = sum(grains_on_square(square) for square in range(1, 65))
    return total_grains





'''

# Example usage:
square_number = 5
print(f"Grains on square {square_number}: {grains_on_square(square_number)}")
print(f"Total grains on the chessboard: {total_grains_on_board()}")
```

This code defines two functions:

1. `grains_on_square(square)`: Calculates the number of grains on a given square. It uses the formula `2^(square - 1)` to calculate the number of grains for the given square.
2. `total_grains_on_board()`: Calculates the total number of grains on the entire chessboard by summing up the grains on each square using a list comprehension.

You can call these functions with appropriate arguments to get the desired results.


'''
