import numpy as np
import pandas as pd

import seaborn as sns

import matplotlib.pyplot as plt

dict2 = {
'a':'numOfIf',
'b':'numOfStatement',
'c':'numOfvariableDeclaration',
'd':'maxDepthOfAST',
'e':'numOfLoc',
'f':'Cyclomatic',
'g':'numOfDepend',
'h':'Halstead_difficulty',
'i':'Halstead_volume',
'j':'Halstead_effort',
'k':'numOfMethod',
'l':'numOfSwitch',
'm':'numOfExpression',
'n':'numOfClass',
'o':'numOfIteration',
'p':'numOfNodes',
'q':'numOfNodeKinds',
'r':'maxDepthOfNest',
's':'avDepthOfNest',
't':'maxWidth',
'u':'line coverage',
'v':'function coverage',
'w':'branch coverage'
}
list = []
f = open("J:\\deep learning\\untitled2\\Graduate_experiment-master\\Graduate_experiment-master\\opo_js\\target_2\\test_data")
test_data = f.read()
sstr_list = test_data.split('\n')
dict1 = {}
for i in range(0,23):
    dict1[dict2[chr(ord('a')+i)]] = []
iiii = 0
for sstr in sstr_list:
    iiii+=1
    if sstr != "":
        elements = sstr.split(',')
        print(iiii)
        i = 0
        for element in elements:
            dict1[dict2[chr(ord('a') + i)]].append(float(element))
            i+=1
for key in dict1.keys():
    dict1[key] = np.array(dict1[key])


data = pd.DataFrame(dict1)

l1 = data.corr('kendall')
l2 = data.corr('spearman')
l3 = data.corr('pearson')

fig = plt.figure()
ax = fig.add_subplot(figsize=(20,20)) #图片大小为20*20
ax = sns.heatmap(l3, linewidths=0.05,vmax=1, vmin=0 ,annot=True,annot_kws={'size':6,'weight':'bold'})
#热力图参数设置（相关系数矩阵，颜色，每个值间隔等）
#ticks = numpy.arange(0,16,1) #生成0-16，步长为1
plt.xticks(np.arange(23)+0.5) #横坐标标注点
plt.yticks(np.arange(23)+0.5) #纵坐标标注点
#ax.set_xticks(ticks) #生成刻度
#ax.set_yticks(ticks)
#ax.set_xticklabels(names) #生成x轴标签
#ax.set_yticklabels(names)
ax.set_title('Characteristic correlation')#标题设置
plt.savefig('cluster.tif',dpi=300)
plt.show()



print(l1,l2)
