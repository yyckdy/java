package dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Dom4jTest2 {
    @Test
    public void parseToList() throws Exception {
        //1.导入框架
        //2.创建SAXReader框架
        SAXReader saxReader = new SAXReader();
        //3.加载xml文件 成为文档对象
        Document document = saxReader.read(Dom4jTest2.class.getResourceAsStream("/Contact.xml"));
        //4.先提取根元素
        Element rootElement = document.getRootElement();
        //5.提取contact子元素
        List<Element> contactElements = rootElement.elements("contact");
        //6.准备集合封装信息
        List<Contact> contacts = new ArrayList<>();
        //7.遍历Contact子元素
        for (Element contactElement : contactElements) {
            //8.每个子元素都是一个联系人对象
            Contact contact = new Contact();
            contact.setId(Integer.parseInt(contactElement.attributeValue("id")));
            contact.setVip(Boolean.parseBoolean(contactElement.attributeValue("vip")));
            contact.setName(contactElement.elementText("name"));
            contact.setGender(contactElement.elementText("gender").charAt(0));
            contact.setEmail(contactElement.elementText("email"));
            contacts.add(contact);
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
