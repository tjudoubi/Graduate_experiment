#coding=utf-8
import os
import time
import subprocess
'''
Created on 2019-2-14
@author: Zyx
'''

dirPath = "/home/doubi/KKID_LSK/target/"
# python 使用类创建结构体
class Myclass(object):
	def __init__(self, name, numOfIf, numOfWhile, numOfFor, numOfStatement, numOfvariableDeclaration, maxDepthOfAST,numOfLoc,Cyclomatic,Dependency_count,Halstead_difficulty,Halstead_volume,Halstead_effort,numOfMethod,numOfSwitch):
		self.name = name
		self.numOfIf = numOfIf
            	self.numOfWhile = numOfWhile
            	self.numOfFor = numOfFor
	    	self.numOfStatement = numOfStatement
	    	self.numOfvariableDeclaration = numOfvariableDeclaration
	    	self.maxDepthOfAST = maxDepthOfAST
		self.numOfLoc = numOfLoc
		self.Cyclomatic = Cyclomatic
		self.numOfDepend = Dependency_count
		self.Halstead_difficulty = Halstead_difficulty
		self.Halstead_volume = Halstead_volume
		self.Halstead_effort = Halstead_effort
		self.numOfMethod = numOfMethod
		self.numOfSwitch = numOfSwitch


def extract(str_out):
	str2 = "Function:"	
	length = len(str_out)
	numOfMethod = (length - len(str_out.replace(str2,""))) / len(str2)
	
	list_out = str_out.split('\n')

	numOfLoc = list_out[12].split(':')[1]
	#print(str_out)
	#print(int(numOfLoc))
	
	Cyclomatic = 0
	Dependency_count = 0
	Halstead_difficulty = 0
	Halstead_volume = 0
	Halstead_effort = 0
	
	i = 12
	while i < len(list_out):
		ss = list_out[i]
		if ss.find('Cyclomatic complexity:',0,len(ss))!=-1:
			Cyclomatic+=int(ss.split(':')[1])
		elif ss.find('Dependency count:',0,len(ss))!=-1:
			Dependency_count += int(ss.split(':')[1])
		elif ss.find('Halstead difficulty:',0,len(ss))!=-1:
			Halstead_difficulty += float(ss.split(':')[1])
		elif ss.find('Halstead volume:',0,len(ss))!=-1:
			Halstead_volume += float(ss.split(':')[1]) 
		elif ss.find('Halstead effort:',0,len(ss))!=-1:	
			Halstead_effort += float(ss.split(':')[1])
		i+=1

	return numOfLoc,Cyclomatic,Dependency_count,Halstead_difficulty,Halstead_volume,Halstead_effort,numOfMethod

list_ = []
files = os.listdir(dirPath)


for file_name in files:
	#1.打开文件
	file=open(dirPath+file_name)
	#2.读取文件内容
	text=file.read()
	length = len(text)
	#print(text)

	str2 = "ifStatement "
	numOfIf = (length - len(text.replace(str2,""))) / len(str2)

	str2 = "for "
	numOfFor = (length - len(text.replace(str2,""))) / len(str2)

	str2 = "while "
	numOfWhile = (length - len(text.replace(str2,""))) / len(str2)

	str2 = "(statement "
	numOfStatement = (length - len(text.replace(str2,""))) / len(str2)

	str2 = "variableDeclaration "
	numOfvariableDeclaration = (length - len(text.replace(str2,""))) / len(str2)

	str2 = "(switchStatement "
	numOfSwitch = (length - len(text.replace(str2,""))) / len(str2)
	##########################
	######获取深度
	#########################
	sum_ = 0
	height = 0
	i = 0
	ans = 0
		
	while i<length:
 		c = text[i]
 		if c=='(':
    			if text[i+1]!=' ' and text[i+1]!=')':
    				sum_ += 1
    			elif text[i+1]==' ' or text[i+1] == ')':
				ans += 1
		
    			height = max(height,sum_)

 		elif c==')':
    			if text[i-1] != ' ':
    				sum_ -= 1
    			elif text[i-1] == ' ':
				ans += 1
 		i+=1

	print(height,ans)
	maxDepthOfAST = height

	#test1 = myclass.make_struct(numOfIf, numOfWhile, numOfFor, numOfStatement,numOfvariableDeclaration,maxDepthOfAST)
	##################################################################################################################
	#################################################################################################################3
	file_name_length = len(file_name)
	command = "cr /home/doubi/KKID_LSK/"+file_name[0:file_name_length-4]
	print(command)
	back = subprocess.Popen(command, shell=True, stdout=subprocess.PIPE,stderr=subprocess.PIPE).communicate()
	#time.sleep(2)
	str_ll = str(back[0].decode())
	numOfLoc,Cyclomatic,Dependency_count,Halstead_difficulty,Halstead_volume,Halstead_effort,numOfMethhod = extract(str_ll)

	test1 = Myclass(file_name,numOfIf, numOfWhile, numOfFor, numOfStatement,numOfvariableDeclaration,maxDepthOfAST,numOfLoc,Cyclomatic,Dependency_count,Halstead_difficulty,Halstead_volume,Halstead_effort,numOfMethhod,numOfSwitch)
	list_.append(test1)
	#print("back0----", str_ll) # 注意需要进行解码操作，默认输出的是字节
	#print("back1----", back[1].decode())  # back是一个元祖，可以通过元祖取值的方式获取结果

 
	#3.关闭文件
	file.close()
	#print('\n')
##############################################################################################################
content = ""
for temp in list_:
	content += str(temp.name)+','+str(temp.numOfIf)+','+str(temp.numOfWhile)+','+str(temp.numOfFor)+','+str(temp.numOfStatement)+','+str(temp.numOfvariableDeclaration)+','+str(temp.maxDepthOfAST)+','+str(temp.numOfLoc)+','+str(temp.Cyclomatic)+','+str(temp.numOfDepend)+','+str(temp.Halstead_difficulty)+','+str(temp.Halstead_volume)+','+str(temp.Halstead_effort)+','+str(temp.numOfMethod)+','+str(temp.numOfSwitch)+'\n'

f = open('/home/doubi/KKID_LSK/target_2/vector_1', 'w') #清空文件内容再写
f.write(content)
f.close()


