package dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 使用Dom4j解析xml文件的数据
 * 1.导入框架
 * 2。准备XML文件
 */
public class Dom4jHelloWorld {
    @Test
    public void parseXMLData() throws Exception {
        //1.创建一个dom4j的解析器对象
        SAXReader saxReader = new SAXReader();
        //2.把xml文件加载到内存中
//        Document document = saxReader.read(new File("/Users/yy/IdeaProjects/java/java提高/day12/src/bean.xml"));
        InputStream is = Dom4jHelloWorld.class.getResourceAsStream("/bean.xml");//去src下寻找文件
        Document document = saxReader.read(is);
        Element root = document.getRootElement();//获取根元素对象
        System.out.println(root.getName());

        //3.获取根元素下所以对象 (一级）
        List<Element> sonEles = root.elements();
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }

        //4.拿某个子元素 默认第一个
        Element element = root.element("property");
//        System.out.println(element.getName());
//        System.out.println(element.elementText("name"));
        //5.根据元素获取属性值
        Attribute name = element.attribute("name");
        System.out.println(name.getName() + "===>" + name.getValue());
        Attribute value = element.attribute("value");
        System.out.println(value.getName() + "===>" + value.getValue());
        System.out.println(element.attributeValue("value"));
        //获取当前元素的子元素对象

    }

}
