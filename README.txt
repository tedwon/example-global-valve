~~~
export JAVA_HOME=/root/downloads/jdk1.6.0_45
ant clean
ant
ant module
~~~


~~~
 cd /subsystem=web
 ./valve=MyCustomValve:add(class-name=com.redhat.jboss.support.CustomGlobalValve,module=com.redhat.jboss.support.CustomGlobalValve,enabled=false)
 ./valve=MyCustomValve:add-param(param-name=output,param-value=65536)
 ./valve=MyCustomValve:write-attribute(name=enabled,value=true)
 /:reload
~~~