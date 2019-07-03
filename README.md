# QToast
QToast基于android.widget.Toast定制了其外观表现，单个文件满足极简主义的代码需求。

  使用简介

```
//构造方法，建议传入activity的context
//这使QToast与使用它的activity生命周期一致
//可减少memory leak的发生
public QToast(Context context) 
```

```
//成员方法，显示toast 
//仅传入string文本即可
//默认背景为0xF0808080
public void showMessage(String msg)
```

```
/*成员方法，显示toast 
 *需指定type类型，由于轻量化的考虑没有使用枚举
 *type提供了以下类型
 *WARNING 红色背景 0xF0FF4444
 *MESSAGE 绿色背景 0xF099CC00
 *DEFAULT 蓝色背景 0xF033B5E5
 */
public void showMessage(String msg, int type)
```


  默认背景0xF0808080  
  ![avatar](https://raw.githubusercontent.com/Yanye0xFF/PictureBed/master/images/qtoast/QToast_Default.png)  
  WARNING  
  ![avatar](https://raw.githubusercontent.com/Yanye0xFF/PictureBed/master/images/qtoast/QToast_Warning.png)  
  MESSAGE  
  ![avatar](https://raw.githubusercontent.com/Yanye0xFF/PictureBed/master/images/qtoast/QToast_Message.png)  
  DEFAULT  
  ![avatar](https://raw.githubusercontent.com/Yanye0xFF/PictureBed/master/images/qtoast/QToast_Default_type.png)  
