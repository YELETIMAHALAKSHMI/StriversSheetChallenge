from math import *
from collections import *
from sys import *
from os import *

# Following is the List Node Class
class LinkedListNode:
    def __init__(self, data):

        self.data = data
        self.next = None

    def __del__(self):
        if(self.next):
            del self.next

def deleteNode(node):
    # Write your code here.
    if node is None:
        return None
    else:
        node.next.data,node.data=node.data,node.next.data
        node.next=node.next.next
    pass
