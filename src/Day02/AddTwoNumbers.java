package Day02;


public class AddTwoNumbers {


    public static void main(String[] args) {
        //l1节点
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        ListNode temp=l1.next;
        temp.next = new ListNode(3);
        //l2节点
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        ListNode temp2 = l2.next;
        temp2.next = new ListNode(4);
        //测试
        Solution solution = new Solution();
        ListNode l3 = solution.addTwoNumbers(l1, l2);
        System.out.println(l3.val);
        l3=l3.next;
        System.out.println(l3.val);
        l3=l3.next;
        System.out.println(l3==null?"null":l3.val);

    }

}
//这是链表的节点对象，有三个构造方法。有两个属性，分别是值和下一个节点
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode temp = new ListNode(0);
        int jinWei = 0;
        while (l1!=null||l2!=null){
            if (l1!=null&&l2!=null){
                temp.val=(l1.val+l2.val+jinWei)%10;
                jinWei =(l1.val+l2.val+jinWei)/10;
                l1=l1.next;
                l2=l2.next;
                l3.val=temp.val;
                l3.next = new ListNode(0);
            }
            if (l1==null&&l2!=null){
                l3.val=(l2.val+jinWei)%10;
                jinWei=(l2.val+jinWei)/10;
                l2=l2.next;
                l3.next=new ListNode(0);
                l3=l3.next;
            }
            if (l2==null&&l1!=null){
                l3.val=(l2.val+jinWei)%10;
                jinWei=(l2.val+jinWei)/10;
                l1=l1.next;
                l3.next=new ListNode(0);
                l3=l3.next;
            }
        }
        return l3;
    }
}