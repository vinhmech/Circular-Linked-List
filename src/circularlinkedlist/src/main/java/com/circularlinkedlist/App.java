/**
 *  Filename: App.java
 */

package com.circularlinkedlist;

/** 
 * Create a circular linked list
 * @author Group Trang Lam - Quang Dang - Vinh Nguyen - SJCC_CIS055
 * @version 1.0 - 09/20/2021
 */


public class App 
{
    public static void main( String[] args )
    {
        CircularLinkedList cll = new CircularLinkedList();
        
        //==================================
        //=========== Empty list ===========
        System.out.println("---Empty list---");
        cll.printSize();
        System.out.print("Current element: ");
        cll.printCurrent();
        System.out.print("The list is: ");
        cll.printList();
        System.out.println();


        //=============================================
        //=========== List with only 1 node ===========
        System.out.println("------List with only 1 node------");

        // insert after current
        int insertNum = 5;
        cll.insertAfterCurrent(insertNum);
        System.out.println(String.format("*** Inserted number %d after current", insertNum ));
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        // search
        System.out.println();
        int searchNum = 7;
        System.out.println(String.format("*** Search number: %d", searchNum));
        Node node = cll.search(searchNum);
        if(node == null){
            System.out.println(String.format("Number %d is not found", searchNum));
        }else{
            System.out.println(String.format("Number %d is found", searchNum));
        }
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();

        System.out.println();
        System.out.println();

        int searchNum2 = 5;
        System.out.println(String.format("*** Search number: %d", searchNum2));
        Node node2 = cll.search(searchNum2);
        if(node2 == null){
            System.out.println(String.format("Number %d is not found", searchNum2));
        }else{
            System.out.println(String.format("Number %d is found", searchNum2));
        }
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();
        System.out.println();

        // update
        int newValue = 7;
        int oldValue = 6;
        System.out.println(String.format("*** Update number %d to %d", oldValue, newValue));

        Boolean updateResult = cll.update(oldValue, newValue);

        if(updateResult == false) {
            System.out.println(String.format("Fail to update, number %d is not found in the list", oldValue));
        }else{
            System.out.println(String.format("Successfully updated number %d to %d", oldValue, newValue));
        }

        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();
        System.out.println();

        // update
        int newValue2 = 7;
        int oldValue2 = 5;
        System.out.println(String.format("*** Update number %d to %d", oldValue2, newValue2));

        Boolean updateResult2 = cll.update(oldValue2, newValue2);

        if(updateResult2 == false) {
            System.out.println(String.format("Fail to update, number %d is not found in the list", oldValue2));
        }else{
            System.out.println(String.format("Successfully updated number %d to %d", oldValue2, newValue2));
        }

        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        // delete
        System.out.println();
        int deleteNum = 6;
        System.out.println(String.format("*** The number to delete is: %d", deleteNum));
        Boolean deleteResult = cll.deleteNode(deleteNum);

        if(deleteResult == true) {
            System.out.println(String.format("Deleted number %d", deleteNum));
        }else{
            System.out.println("The number to delete is not found in the list");
        }
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        System.out.println();
        int deleteNum2 = 7;
        System.out.println(String.format("*** The number to delete is: %d", deleteNum2));
        Boolean result2 = cll.deleteNode(deleteNum2);

        if(result2 == true) {
            System.out.println(String.format("Deleted number %d", deleteNum2));
        }else{
            System.out.println("The number to delete is not found in the list.");
        }
        cll.printSize();
        System.out.print("Current element: ");
        cll.printCurrent();
        System.out.print("The list is: ");
        cll.printList();
        System.out.println();

        // insert before current
        int insertNum2 = 10;
        cll.insertBeforeCurrent(insertNum2);
        System.out.println(String.format("*** Inserted number %d before current: ", insertNum2 ));
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();
        System.out.println();

        // delete 
        int deleteNum3 = 10;
        System.out.println(String.format("*** The number to delete is: %d", deleteNum3));
        Boolean result3 = cll.deleteNode(deleteNum3);

        if(result3 == true) {
            System.out.println(String.format("Deleted number %d", deleteNum3));
        }else{
            System.out.println("The number to delete is not found in the list.");
        }
        cll.printSize();
        System.out.print("Current element: ");
        cll.printCurrent();
        System.out.print("The list is: ");
        cll.printList();
        System.out.println();

        //==================================================
        //=========== List with more than 1 node ===========
        System.out.println("------List with more than 1 node------");

        // insertAfterCurrent
        int insertAfter = 3;
        cll.insertAfterCurrent(insertAfter);
        System.out.println(String.format("*** Inserted number %d after current", insertAfter ));
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        System.out.println();
        int insertAfter2 = 4;
        cll.insertAfterCurrent(insertAfter2);
        System.out.println(String.format("*** Inserted number %d after current", insertAfter2 ));
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        //insertBeforeCurrent
        System.out.println();
        int insertBefore = 6;
        cll.insertBeforeCurrent(insertBefore);
        System.out.println(String.format("*** Inserted number %d before current", insertBefore ));
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        // insertBeforeCurrent
        System.out.println();
        int insertBefore3 = 11;
        cll.insertBeforeCurrent(insertBefore3);
        System.out.println(String.format("*** Inserted number %d before current", insertBefore3 ));
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();

        //search
        System.out.println();
        int searchNum3 = 9;
        System.out.println(String.format("*** Search number: %d", searchNum3));
        Node node3 = cll.search(searchNum3);
        if(node3 == null){
            System.out.println(String.format("Number %d is not found", searchNum3));
        }else{
            System.out.println(String.format("Number %d is found", searchNum3));
        }
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();
        System.out.println();

        int searchNum4 = 4;
        System.out.println(String.format("*** Search number: %d", searchNum4));
        Node node4 = cll.search(searchNum4);
        if(node4 == null){
            System.out.println(String.format("Number %d is not found", searchNum4));
        }else{
            System.out.println(String.format("Number %d is found", searchNum4));
        }
        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();
        System.out.println();


        // update
        int updateNum2 = 7;
        System.out.println(String.format("*** Update number %d to %d", insertBefore, updateNum2));

        Boolean updateResult3 = cll.update(insertBefore,updateNum2);

        if(updateResult3 == false) {
            System.out.println(String.format("Fail to update, number %d is not found in the list", oldValue));
        }else{
            System.out.println(String.format("Successfully updated number %d to %d", insertBefore, updateNum2));
        }

        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();


        // delete
        System.out.println();
        int deleteNum4 = 4;
        System.out.println(String.format("*** The number to delete is: %d", deleteNum4));

        Boolean result4 = cll.deleteNode(deleteNum4);
        if(result4 == true) {
            System.out.println(String.format("Deleted number %d", deleteNum4));
        }else{
            System.out.println("The number to delete is not found in the list");
        }

        cll.printSize();
        cll.printCurrent();
        System.out.print("List: ");
        cll.printList();
        System.out.println();
        System.out.println("-------------------------------");
    }
}
