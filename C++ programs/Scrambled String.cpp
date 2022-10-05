/**
 * Solution to famous DP problem "Scrambled String" on leetcode
 * Explanation guidance from Youtube video of Aditya Verma
 * Concept: Matrix Chain Multiplication
 */
class Solution
{
public:
    unordered_map<string, bool> mp;
    bool recurse(string a, string b)
    {
        string unique = a + "#" + b;
        if (mp.find(unique) != mp.end())
            return mp[unique];
        if (a.length() == 0 && b.length() == 0)
            return mp[unique] = true;
        if (a.length() == 0 || b.length() == 0 || (a.length() != b.length()))
            return mp[unique] = false;

        if (a.compare(b) == 0)
            return mp[unique] = true;
        int n = a.length();
        for (int i = 1; i <= n - 1; i++)
        {
            // If either swapped and unswapped returns true, then they are scrambled string
            // if swapped || un-swapped condition 1 || condition 2
            bool condition1 = (recurse(a.substr(0, i), b.substr(n - i)) && recurse(a.substr(i), b.substr(0, n - i)));
            bool condition2 = (recurse(a.substr(0, i), b.substr(0, i)) && recurse(a.substr(i), b.substr(i)));
            if (condition1 || condition2)
            {

                return mp[unique] = true;
            }
        }
        return mp[unique] = false;
    }
    bool isScramble(string s1, string s2)
    {
        mp.clear();

        return recurse(s1, s2);
    }
};