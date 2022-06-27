public class Image {

  private String fileName;
  private int width;
  private int height;

  public static void main(String[] args) {
    Image main = new Image();

    main.go();
  }

  public void go(){
    fileName = "test.png";
    width =10;
    height = 9;
    System.out.println(isKnownFileType());
    System.out.println("Is it a portrait? " + isPortrait());
    System.out.println("Is it a landscape? " + isLandscape());
  }

  public boolean isKnownFileType(){

    if(fileName.endsWith(".png")){
      return true;
    }
    else if (fileName.endsWith(".jpg")){
      return true;
    }
    else if(fileName.endsWith(".jpeg")){
      return true;
    }
    else if(fileName.endsWith(".gif")){
      return true;
    }
    else if(fileName.endsWith(".webp")){
      return true;
    }
    else if(fileName.endsWith(".bmp")){
      return true;
    }
      return false;
  }

  public boolean isPortrait(){
    if(height > width){
      return true;
    }
    else
      return false;
  }

  public boolean isLandscape(){
    if(width > height){
      return true;
    }
    else
      return false;
  }
}
