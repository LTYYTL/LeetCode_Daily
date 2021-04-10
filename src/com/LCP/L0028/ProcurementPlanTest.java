package com.LCP.L0028;

public class ProcurementPlanTest {
    public static void main(String[] args) {
        ProcurementPlan procurementPlan = new ProcurementPlan();
        int[] nums = {2,5,3,5};
        System.out.println(procurementPlan.purchasePlans(nums, 6));

        int[] nums1 = {2,2,1,9};
        System.out.println(procurementPlan.purchasePlans(nums1, 10));
    }
}
