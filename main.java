class binarySearch
{
  int binarySearch(int list[], int front, int rear, int key)
  {
   	int middle = (front + rear) / 2;
    
    if(front > rear || rear > list.length - 1)
    {
      return -1;
    }
    else if(key == list[middle])
    {
      return middle;
    }
    else if(key < list[middle])
    {
      return binarySearch(list, front, middle - 1, key);
    }
    else if(key > list[middle])
    {
      return binarySearch(list, middle + 1, rear, key);
    }
    return -1;
  }
}

public class main
{
  public static void main(String args[])
  {
    binarySearch bin = new binarySearch();
    int list[] = {1,5,7,12,19,22};
    int key = 5;
    int result = bin.binarySearch(list, 0, list.length - 1, key);
    if(result == -1)
    {
      System.out.println("Key was not found.");
    }
    else
    {
      System.out.println("key was found at position " + result);
    }

    key = 50;
    result = bin.binarySearch(list, 0, list.length - 1, key);
    if(result == -1)
    {
      System.out.println("Key was not found.");
    }
    else
    {
      System.out.println("key was found at position " + result);
    }
  }
}