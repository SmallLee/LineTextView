# LineTextView
带有删除线和下划线的TextView，同样可以作为普通TextView使用

##效果图
![img](https://github.com/SmallLee/LineTextView/blob/master/QQ%E6%88%AA%E5%9B%BE20160829155418.png)


##布局文件使用
1.布局文件，和普通TextView一样

```Java
<com.fang.linetextview.LineTextView
      android:id="@+id/textview"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:textSize="26sp"
      android:textColor="#FF0080"
      />
```
2.代码

```Java
 //普通文字
        lineTextView.setText("#1999");
        //带删除线的文字
        lineTextView1.setText("#2999",LineTextView.MIDDLE);
//        //带下划线的文字
        lineTextView2.setText("#1999",LineTextView.BOTTOM);
```





