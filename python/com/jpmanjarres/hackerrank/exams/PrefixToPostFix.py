

class Node:
   def __init__(self,data):
       self.left = None
       self.right = None
       self.data = data


def create_tree(str):

    root = Node(str[0])
    curr = root
    parent = None

    for i in range(1,len(str)):

        c = str[i]
        oper = True if c in ['+','*','/','-'] else False

        inserted = False

        while not inserted:

            if curr.left is None:
                curr.left = Node(c)
                inserted = True
                if oper:
                    parent = curr
                    curr = curr.left

            elif curr.right is None:
                curr.right = Node(c)
                inserted = True
                if oper:
                    parent = curr
                    curr = curr.right

            else:
                curr = parent

    return root







def  prefixToPostfix(prefixes):

    posts = []

    for s in prefixes:

        tree = create_tree(s)
        print(tree)

    return posts




n = int(input().strip())
pref = []
for i in range(n):
    pref.append(input().strip())

print(prefixToPostfix(pref))