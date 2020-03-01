class Node:
    def __init__(self,type_,L,R,id,len):
        self.type_ = type_
        self.L = L
        self.R = R
        self.id = id
        self.len = len

class Tree_node:
    Tree_node_list = []

import os

def node_list_cmp(node_a,node_b):
    if node_a.le != node_b.le:
        return node_a.le - node_b.le
    else:
        return node_b.id - node_a.id

dirPath = "/home/doubi/KKID_LSK/target_3/"

files = os.listdir(dirPath)

for file_name in files:
    file=open(dirPath+file_name)
    text=file.read()
    list_x = text.split('\n')

    list = []
    i = 0
    while i < len(list_x):
        temp_ = list_x[i].split(',')
        type_ = temp_[0]
        L = int(temp[1])
        R = int(temp[2])
        id = int(temp[3])
        len = int(temp[4])
        node = Node(type_,L,R,id,len)
        list.append(node)
        i += 1

    list.sort(cmp = node_list_cmp)