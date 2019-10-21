/**
����?n ���Ǹ�������ʾÿ�����Ϊ 1 �����ӵĸ߶�ͼ�����㰴�����е����ӣ�����֮���ܽӶ�����ˮ��



������������ [0,1,0,2,1,0,1,3,2,1,2,1] ��ʾ�ĸ߶�ͼ������������£����Խ� 6 ����λ����ˮ����ɫ���ֱ�ʾ��ˮ����?��л Marcos ���״�ͼ��

ʾ��:

����: [0,1,0,2,1,0,1,3,2,1,2,1]
���: 6

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/trapping-rain-water
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������

*/

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
			return 0;
		}
		int result = 0;
		int[] left = new int[height.length];
		left[0] = height[0];
		int right = height[height.length-1];
		for (int i = 1; i < height.length; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}
		for (int i = height.length - 2; i >= 0; i--) {
			right = Math.max(right, height[i]);
			result += Math.min(left[i], right) - height[i];
		}
		return result;
    }
}