## FileIO ##
<TABLE>
<TR>
<TH>Task</TH>
<TH>Elapsed Time</TH>
</TR>
<TR>
<TD>Copy a file byte-by-byte</TD>
<TD>3.488373 sec</TD>
</TR>
<TR>
<TD>Copy a file using a byte array of size 1KB(1024)</TD>
<TD>0.009700 sec</TD>
</TR>
<TR>
<TD>Copy a file using a byte array of size 4KB(4*1024)</TD>
<TD>0.003713 sec</TD>
</TR>
<TR>
<TD>Copy a file using a byte array of size 64KB(64*1024)</TD>
<TD>0.001684 sec</TD>
</TR>
<TR>
<TD>Copy a file using a BufferedReader and PrintWriter</TD>
<TD>0.060577 sec</TD>
</TR>
<TR>
<TD>Copy a file using a BufferedReader and BufferedWriter with an array of char</TD>
<TD>0.011647 sec</TD>
</TR>
</TABLE>

##Explanation##
###Copy a file byte-by-byte###
 This task use longest time for copy the file because the program must copy only one byte at a time.<br>
###Copy a file using a byte array of size 1KB(1024)###
 This task use faster time than "Byte to byte" to copy the file because the program copy 1KB at a time.<br>
###Copy a file using a byte array of size 4KB(4*1024)###
 This task use faster time than "1KB" to copy the file because the program copy 4KB at a time.
###Copy a file using a byte array of size 64KB(64*1024)###
 This task use faster time than "4KB" to copy the file because the program copy 64KB at a time.
###Copy a file using a BufferedReader and PrintWriter###
 This task use longer time than 1KB,4KB and 64KB to copy the file because the program copy line of text at a time.
 
