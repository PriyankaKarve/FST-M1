#name = input()
from typing import NamedTuple


try:
    print(NamedTuple)
except NameError:
    print("No value entered")