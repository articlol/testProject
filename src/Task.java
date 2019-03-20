import java.util.ArrayList;
import java.util.LinkedList;

public class Task {
        public static void main(String[] args) {
            Element e5 = new Element("!!!", null);
            Element e4 = new Element("You", e5);
            Element e3 = new Element("Bless", e4);
            Element e2 = new Element("God", e3);
            Element e1 = new Element("May", e2);
            //Must print "Bless"
            System.out.println(findMiddleElement(e1).getValue());
        }

        private static Element findMiddleElement(Element head) {
            Element fast = head;
            Element slow = head;
            while(fast != null && fast.getNext() != null) {
                fast = fast.getNext().getNext();
                slow = slow.getNext();
                }
                return slow;
        }
        static class Element {

            private final String value;
            private final Element next;

            Element(String value, Element next) {
                this.value = value;
                this.next = next;
            }

            public String getValue() {
                return value;
            }

            public Element getNext() {
                return next;
            }
        }
    }

