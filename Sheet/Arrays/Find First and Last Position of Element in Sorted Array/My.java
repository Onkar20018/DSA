public class My {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 4, 5, 5 };
        int find = 2;
        int[] k = searchRange(arr, find);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {

        if (nums.length <= 1) {
            if (target == 0) {
                int[] js = { -1, -1 };
                return js;
            } else {
                int[] js = { 0, 0 };
                return js;
            }
        }
        
        boolean find = false;
        int[] k;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int s = -1;
        int e = -1;
        while (start < end) {
            if (start == 0 && end == 1) {
                if (target == nums[start] && target == nums[end]) {
                    int ks[] = { 0, 1 };
                    return ks;
                } else if (target != nums[start] && target == nums[end]) {
                    int ks[] = { 1, 1 };
                    return ks;
                } else if (target == nums[start] && target != nums[end]) {
                    int[] ks = { 0, 0 };
                    return ks;
                } else if (target != nums[start] && target != nums[end]) {
                    int[] ks = { -1, -1 };
                    return ks;
                }
            } else {
                mid = (start + end) / 2;
                if (end == nums.length - 1 && start == end - 1) {
                    if (target == nums[start] && target == nums[end]) {
                        int ks[] = { start, end };
                        return ks;
                    } else if (target != nums[start] && target == nums[end]) {
                        int ks[] = { end, end };
                        return ks;
                    } else if (target == nums[start] && target != nums[end]) {
                        int[] ks = { start, start };
                        return ks;
                    } else if (target != nums[start] && target != nums[end]) {
                        int[] ks = { -1, -1 };
                        return ks;
                    }
                }
                // System.out.println("INNN");
                if (nums[mid] == target) {
                    System.out.println("Found at:" + mid);
                    find = true;
                    s = mid;
                    e = mid;
                    while ((s > 0) && (nums[s] == nums[s - 1])) {
                        System.out.println("HAHA2");
                        s--;
                    }
                    while ((e < nums.length - 1) && (nums[e] == nums[e + 1])) {
                        System.out.println("HAHA");
                        e++;
                    }
                    break;
                } else if (nums[mid] > target) {
                    // System.out.println("Greater");
                    end = mid-1;
                } else if (nums[mid] < target) {
                    System.out.println("Less at mid=" + mid + " end =" + end);
                    start = mid+1;
                }
            }
        }
        {
            int[] j = { s, e };
            return j;
        }
    }
}
