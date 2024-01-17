# Task 1
def eat_ghost(power_pellet_active, touching_ghost):
    """Verify that Pac-Man can eat a ghost if he is empowered by a power pellet."""
    return power_pellet_active and touching_ghost

# Task 2
def score(touching_power_pellet, touching_dot):
    """Verify that Pac-Man has scored when a power pellet or dot has been eaten."""
    return touching_power_pellet or touching_dot

# Task 3
def lose(power_pellet_active, touching_ghost):
    """Trigger the game loop to end (GAME OVER) when Pac-Man touches a ghost without his power pellet."""
    return not power_pellet_active and touching_ghost

# Task 4
def win(has_eaten_all_dots, power_pellet_active, touching_ghost):
    """Trigger the victory event when all dots have been eaten."""
    return has_eaten_all_dots and not lose(power_pellet_active, touching_ghost)