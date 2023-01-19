@FunctionalInterface  //аннотация - проверяет, чтобы было не более одного абстрактного метода
public interface OnTaskDoneListener {  //функциональный интерфейс, с одним абстрактным методом
    void onDone(String result);  //абстрактный метод без реализации
}
