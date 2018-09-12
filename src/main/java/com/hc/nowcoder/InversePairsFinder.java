package com.hc.nowcoder;

public class InversePairsFinder {
	
	public int InversePairs(int [] array) {
		if(array == null || 0 == array.length) {
			return 0;
		}
		int[] copy = new int[array.length];		
		return (int)( inversePairsCount(array, copy, 0 , array.length -1)  % 1000000007 );		
    }
	
	private long inversePairsCount(int[] array,int[] copy,  int start, int end) {
		long  count = 0;
		if(start == end) {
			return count;
		}
		
		int middle = (start + end) / 2;	
		long leftCount = inversePairsCount(array, copy, start, middle);
		long rightCount = inversePairsCount(array, copy, middle + 1, end);
		
		int preSegmentTrail = middle;
		int nextSegmentTrail = end;
		
		int copyArrayTrail = end;

		while( preSegmentTrail >= start && nextSegmentTrail >= middle + 1 ) {
			if(array[preSegmentTrail] > array[nextSegmentTrail]) {
				count += (nextSegmentTrail - middle);		
				copy[copyArrayTrail--] = array[preSegmentTrail--];								
			} else {
				copy[copyArrayTrail--] = array[nextSegmentTrail--];
			}
		}
		
		for(;preSegmentTrail >= start; preSegmentTrail--) {
			copy[copyArrayTrail--] = array[preSegmentTrail];
		}
		
		for(;nextSegmentTrail >= middle + 1; nextSegmentTrail--) {
			copy[copyArrayTrail--] = array[nextSegmentTrail];
		}
		
		
		for(int i = start; i <= end; i++) {
			array[i] = copy[i];
		}
		
		return leftCount + rightCount + count;
	}

	public int InversePairs_outOfTime(int [] array) {				
		return inversePairsCountOutOfTime(array, 0 , array.length -1)  % 1000000007;		
    }

	private int inversePairsCountOutOfTime(int[] array, int i, int j) {
		if(i == j) {
			return 0;
		} else if(j - i == 1 ) {
			return array[i] > array[j] ? 1 : 0;   
		} else {
			int middle =  (i + j) / 2;
			int leftCount = inversePairsCountOutOfTime(array, i, middle);
			int rightCount = inversePairsCountOutOfTime(array, middle + 1, j);
			int largerCount = findLargerCount(array, i, middle, j);
			return leftCount + rightCount + largerCount;
		}						
	}

	private int findLargerCount(int[] array, int start, int middle, int end) {
		int count = 0;
		for( int startIndex = start; startIndex <= middle; startIndex++) {
			for(int endIndex = middle + 1; endIndex <= end; endIndex++) {
				if(array[startIndex] > array[endIndex]) {
					count++;
				}
			}
		}		
		return count;
	}
	
	public static void main(String[] args) {
		InversePairsFinder inversePairsFinder = new InversePairsFinder();
//		int count = inversePairsFinder.InversePairs(new int[] { 1,2,3,4,5,6,7,0 });

		//2519
		int count = inversePairsFinder.InversePairs(new int[] { 364,637,341,406,747,995,234,971,571,219,
				993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,
				486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,
				256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,
				446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575});
		System.out.print(count);
	}	
}
