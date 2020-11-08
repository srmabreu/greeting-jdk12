## Instalation

sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-12/bin/java 1
sudo update-alternatives --config java

sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-12/bin/javac 1
sudo update-alternatives --config javac

sudo update-alternatives --install /usr/bin/jar jar /usr/lib/jvm/jdk-12/bin/jar 1
sudo update-alternatives --config jar

## Compilation

javac -d mods/com.features src/com.features/module-info.java src/com.features/com/features/StringMethods.java

java -p mods -m com.features/com.features.StringMethods