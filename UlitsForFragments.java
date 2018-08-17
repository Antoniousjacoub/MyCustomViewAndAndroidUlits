   
   private void replaceFragment(Fragment selectedFragment, String tag) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().addToBackStack(null);
        transaction.replace(R.id.container_spectator_autograph, selectedFragment, tag);
        transaction.commit();
    }
