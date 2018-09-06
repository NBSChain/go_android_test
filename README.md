# go_android_test
 android 调用go语言实现的aar包 
一.go 环境配置参考下面的这篇博客
    里面包含下载地址，环境变量的配置，工作环境的配置等非常详细亲测没有问题
    https://blog.csdn.net/sysu_cm/article/details/52584604
二.   golang开发android环境搭建介绍
    1.安装依赖软件：
　　git：版本管理
　　go:  go开发环境(版本>=1.5)，可直接下载window版的go安装包。(第一步里面已经有讲解)
　　android studio： android开发IDE
   2.gomobile的安装
    命令行执行 go get golang.org/x/mobile/cmd/gomobile  ,如果无法访问golang.org，
    可以访问 https://github.com/golang/mobile 直接下载源程序，并将mobile文件夹拷贝到在 $GOPATH/src/golang.org/x/ 下
    (注明 :$GOPATH go程序工作目录，参考go环境搭建相关知识)
    执行下面的代码生成gomobile.exe
       go build golang.org/x/mobile/cmd/gomobile
       go install golang.org/x/mobile/cmd/gomobile
       完成后可以在 $GOPATH/bin 下可以发现 gomobile.exe 生成
    设置环境变量ANDROID_HOME，值为android sdk的路径，我这里把android sdk放在了E:\Androidsdk，把ANDROID_HOME值设置为E:\Androidsdk就好了
    接着调用gomobile init 关联ndk
    执行完之后在$GOPATH/bin  下会生成gobind.exe,这个用来编译go文件成Android中的jar包和aar包
    
    
三.编译安卓下的jar包
   在$GOPATH/src目录下新建工程hello,编写一个hello.go文件，主要内容是接受一个字符串，然后改造输出代码如下
    package hello
    import "fmt"
    func Greetings(name string) string {
	  return fmt.Sprintf("Hello, %s!", name)
    }
    
    下面在dos下切换到hello.go所在目录 执行 gomobile bind -target=android 此时在工程目录下会生成hello.jar和hello.aar
    
    
    接着android studio 调用aar包就不详细讲解了
       
