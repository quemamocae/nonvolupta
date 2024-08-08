public static long calculatePagesCount(long pageSize, long totalCount) {
    return totalCount < pageSize ? 1 : (long) Math.ceil((double) totalCount / (double) pageSize);
}
