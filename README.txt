~~~
 cd /subsystem=web
 ./valve=MyCustomValve:add(class-name=com.redhat.jboss.support.CustomGlobalValve,module=com.redhat.jboss.support.CustomGlobalValve,enabled=false)
 ./valve=MyCustomValve:add-param(param-name=output,param-value=65536)
 ./valve=MyCustomValve:write-attribute(name=enabled,value=true)
 /:reload
~~~