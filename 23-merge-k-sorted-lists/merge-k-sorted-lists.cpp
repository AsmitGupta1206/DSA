class Solution {
public:

    ListNode* mergeTwoLists(ListNode* a, ListNode* b) {

        ListNode dummy(0);
        ListNode* tail = &dummy;

        while (a != NULL && b != NULL) {

            if (a->val <= b->val) {
                tail->next = a;
                a = a->next;
            }
            else {
                tail->next = b;
                b = b->next;
            }

            tail = tail->next;
        }

        if (a != NULL)
            tail->next = a;
        else
            tail->next = b;

        return dummy.next;
    }

    ListNode* mergeKLists(vector<ListNode*>& lists) {

        ListNode* result = NULL;

        for (int i = 0; i < lists.size(); i++) {
            result = mergeTwoLists(result, lists[i]);
        }

        return result;
    }
};