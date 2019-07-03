# QToast
QToast基于android.widget.Toast定制了其外观表现，单个文件
满足极简主义的代码需求。
使用简介
```
//构造方法，建议传入activity的context
//这使QToast与使用它的activity生命周期一致
//可减少memory leak的发生
public QToast(Context context) 
```