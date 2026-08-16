package DSA.HashMap;

class ThreePointer {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int required = -(nums[i] + nums[j]);

                if (seen.contains(required)) {
                    result.add(Arrays.asList(
                        nums[i],
                        required,
                        nums[j]
                    ));
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}