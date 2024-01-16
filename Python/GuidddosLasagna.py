# lasagna.py
EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.
    """
    bake_time_remaining = EXPECTED_BAKE_TIME - elapsed_bake_time
    return bake_time_remaining

def preparation_time_in_minutes(layers):
    """Calculate the preparation time in minutes.

    :param layers: int - number of layers.
    :return: int - total preparation time (in minutes) based on 'PREPARATION_TIME' per layer.
    """
    preparation_time = layers * PREPARATION_TIME
    return preparation_time

def elapsed_time_in_minutes(layers, elapsed_bake_time):
    """Calculate the elapsed time in minutes.

    :param layers: int - number of layers.
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - total elapsed time (in minutes) based on preparation and baking time.
    """
    elapsed_time = preparation_time_in_minutes(layers) + elapsed_bake_time
    return elapsed_time

# main.py
import lasagna

# Example usage
elapsed_bake_time = 10
layers = 6

print(lasagna.bake_time_remaining(elapsed_bake_time))
print(lasagna.preparation_time_in_minutes(layers))
print(lasagna.elapsed_time_in_minutes(layers, elapsed_bake_time))