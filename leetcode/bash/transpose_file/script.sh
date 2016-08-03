#!/bin/bash
#transposes the rows and columns of a file
file="file.txt"
rows=$(cat $file | wc -l)
cols=$(head -n 1 $file | wc -w)
i=1
while [ $i -le $cols ] 
do
     j=1
     while [ $j -le $rows ]
     do
	  echo `sed $j"q;d" $file` | awk -v N=$i '{printf $N}' 
	  printf ' '
	  j=$[$j+1]
     done 
	 printf '\r\n'
     i=$[$i+1]
done
