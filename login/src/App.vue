<template>
  <div class="vue-tempalte">
    <!-- Navigation -->
    <nav class="navbar shadow bg-white rounded justify-content-between flex-nowrap flex-row fixed-top">
      <div class="container">
      <a class="navbar-brand" href="#">
      <img src="./assets/download.jpg" alt="..." height="40">
    </a>
       <h2 style = "margin-right: auto">
       Bank AlHabib
       </h2>
      </div>
    </nav>

    <!-- Main -->
    <div class="App">
      <div class="vertical-center">
        <div class="inner-block">
          <router-view />
        </div>
      </div>
    </div>
  </div>
</template>