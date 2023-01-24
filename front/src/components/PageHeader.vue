<!-- PageHeader.vue -->
<template>
  <header>
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> |
      <router-link to="/board/list">게시판</router-link> |
      <router-link to="/login">로그인</router-link>
    </div>
  </header>

</template>

<script>
export default {

}
</script>

<style scoped>

#nav{
  text-align: center;
}

</style>