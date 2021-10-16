# Singly Linked List
<!-- Short summary or background information -->
Linked list is a group of nodes and each node contains address and data part. every node has it's specific address by using the pointer utility every node can point on the address of the other node by getting it's address. Due to the dynamically and ease of insertions and deletions, they are preferred over the arrays.


## Challenge
<!-- Description of the challenge -->
the challenge was we need to insert a new nodes and make the head at first always without broking the connection. Also, by making include method we search the given value if it is there or not. And creating print method that will print the inserted value. 

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I started by making the node class and add in it the pointer and the value, then I added the started to add the methods that will allow me to insert a new nodes,searching for the data, and printing the nodes.

Big O:
insert method => Big O(1) time/space.
include method => Big O(n) time/space.
Stringing method => Big O(n) time/space.

## API
<!-- Description of each method publicly available to your Linked List -->
insert(value)=> Its used to insert a new node with data,and then the linked list created.
includes(value)=> to search a specific value from the nodes and returns true if the value is there and false if not there.
Stringing()=> prints the values in a specific form.