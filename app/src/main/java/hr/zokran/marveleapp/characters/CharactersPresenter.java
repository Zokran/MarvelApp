package hr.zokran.marveleapp.characters;


public class CharactersPresenter implements CharactersContract.Presenter {

    private CharactersContract.View mView;

    public CharactersPresenter(CharactersContract.View view) {
        mView = view;
    }

    @Override
    public void getCharacters() {
        if(!mView.isActive()){
            return;
        }


    }
}
