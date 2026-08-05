/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* current1 = l1;
        ListNode* current2 = l2;
        ListNode* position;
        int carry =0;
        ListNode* head = nullptr;
        int valueToAdd = 0;
        while (current1 != nullptr || current2 != nullptr){
            if (current1 == nullptr){
                valueToAdd = current2->val + carry;
                carry = 0;
            }
            else if (current2 == nullptr){
                valueToAdd = current1->val + carry;
                
            }
            else{
                 valueToAdd = (current1->val) + (current2->val) + carry;
            }
           
          
            if (valueToAdd > 9){
                // std:: cout << "value: " << valueToAdd << endl;
                // std:: cout << "carry: " << carry << endl;

                carry = valueToAdd / 10;
                valueToAdd = valueToAdd % 10;

                // std:: cout << "value: " << valueToAdd << endl;
                // std:: cout << "carry: " << carry << endl;
            }
            else{
                carry =0;
            }
             ListNode* node = new ListNode(valueToAdd);
            if (head == nullptr){
                head = node;
                position = node;
            }
            else{
                position->next = node;
                position = node;
            }
            
            if (current1 != nullptr){
                current1 = current1->next;
            }
            if (current2 != nullptr){
                current2 = current2->next;
            }
            
        }
        if (carry != 0){
            ListNode* node = new ListNode(carry);
            position->next = node;
        }
        return head;
    }
};