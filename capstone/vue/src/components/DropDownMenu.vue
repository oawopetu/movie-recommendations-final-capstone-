<template>
  <section class="dropDownMenuWrapper">
    <button class="dropDownMenuButton" ref="menu" @click.prevent="openClose">
      Genres
    </button>

    <div class="iconWrapper">
      <div class="bar1"></div>
      <div class="bar2"></div>
      <div class="bar3"></div>
      <div class="bar4"></div>
      <div class="bar5"></div>
      <div class="bar6"></div>
      <div class="bar7"></div>
      <div class="bar8"></div>
      <div class="bar9"></div>
      <div class="bar10"></div>
      <div class="bar11"></div>
    </div>

    <section class="dropdownMenu" v-if="isOpen">
      <div class="menuArrow" />
      <slot />
    </section>
  </section>
</template>

<script>
export default {
  name: "drop-down-menu",
  props: ["menuTitle"], // Menu title from the parent
  data() {
    return {
      isOpen: false, // Variable if the menu is open or closed
    };
  },
  methods: {
    openClose() {
      // Toggle between open or closed ( true || false )
      this.isOpen = !this.isOpen;
    },
    catchOutsideClick(event, dropdown) {
      if (dropdown == event.target) return false;

      // When user clicks outside of the menu — close the menu
      if (this.isOpen && dropdown != event.target) return true;
    },
  },
};
</script>

<style>
.dropDownMenuWrapper {
  position: relative;
  width: 70px;
  height: 20px;
  border-radius: 8px;
  background: white;
  border: 1px solid #eee;
  box-shadow: 10px 10px 0 0 rgba(black, 0.03);
  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}

.dropDownMenuWrapper * {
  box-sizing: border-box;
  text-align: left;
}

.dropDownMenuButton {
  border: none;
  color: orangered;
  font-size: inherit;
  background: none;
  outline: none;
  border-radius: 4px;
  position: absolute;
  top: 0;
  left: 0;
  display: flex;
  align-items: center;
  padding: 0 70px 0 0px;
  margin: 0;
  line-height: 1;
  width: 100%;
  height: 100%;
  z-index: 2;
  cursor: pointer;
}

.dropDownMenuButton--dark {
  color: #eee;
}

.iconWrapper--noTitle {
  left: 0;
  top: 0;
  bottom: 0;
  right: 0;
  width: auto;
  height: auto;
  transform: none;
}

.dropdownMenu {
  position: absolute;
  top: 100%;
  width: 100%;
  min-width: 300px;
  min-height: 10px;
  border-radius: 8px;
  border: 1px solid #eee;
  box-shadow: 10px 10px 0 0 rgba(black, 0.03);
  background: white;
  padding: 10px 30px;
  animation: menu 0.3s ease forwards;
}

.menuArrow {
  width: 20px;
  height: 20px;
  position: absolute;
  top: -10px;
  left: 20px;
  border-left: 1px solid #eee;
  border-top: 1px solid #eee;
  background: white;
  transform: rotate(45deg);
  border-radius: 4px 0 0 0;
}

.menuArrow--dark {
  background: #333;
  border: none;
}

.option {
  width: 100%;
  border-bottom: 1px solid #eee;
  padding: 20px 0;
  cursor: pointer;
  position: relative;
  z-index: 2;
}

/* &:last-child {
    border-bottom: 0;
      } */

* {
  color: inherit;
  text-decoration: none;
  background: none;
  border: 0;
  padding: 0;
  outline: none;
  cursor: pointer;
}

.desc {
  opacity: 0.5;
  display: block;
  width: 100%;
  font-size: 14px;
  margin: 3px 0 0 0;
  cursor: default;
}

.dropdownMenu--dark {
  background: #333;
  border: none;
}

.option {
  border-bottom: 1px solid #888;
}

* {
  color: #eee;
}

@keyframes menu {
  from {
    transform: translate3d(0, 30px, 0);
  }
  to {
    transform: translate3d(0, 20px, 0);
  }
}

.dropDownMenuWrapper--noTitle {
  padding: 0;
  width: 60px;
  height: 60px;
}

.dropDownMenuWrapper--dark {
  background: #333;
  border: none;
}
.iconWrapper {
  width: 25px;
  height: 25px;
  position: absolute;
  right: 30px;
  top: 50%;
  transform: translate(0, -50%);
  z-index: 1;
}

/* .bar1 {
      width: 100%;
      max-width: 28px;
      height: 3px;
      background: blue;
      position: absolute;
      top: 50%;
      left: 50%;
      border-radius: 9999px;
      transform: translate(-50%, calc(-50% - 8px));
      transition: all 0.2s ease;
    } */

/* .bar1--dark {
      background: #eee;
    }
    
    .bar1--open {
      transform: translate(-50%, -50%) rotate(45deg);
      margin-top: 0;
      background: red;
    }
    
    .bar2 {
      width: 100%;
      max-width: 28px;
      height: 3px;
      background: blue;
      position: absolute;
      top: 50%;
      left: 50%;
      border-radius: 9999px;
      opacity: 1;
      transform: translate(-50%, -50%);
      transition: all 0.2s ease;
    }
    
    .bar2--dark {
      background: #eee;
    }
    
    .bar2--open {
      opacity: 0;
    }
    
    .bar3 {
      width: 100%;
      max-width: 28px;
      height: 3px;
      background: blue;
      position: absolute;
      top: 50%;
      left: 50%;
      border-radius: 9999px;
      transform: translate(-50%, calc(-50% + 8px));
      transition: all 0.2s ease;
    }
    
    .bar3--dark {
      background: #eee;
    }
    
    .bar3--open {
      top: 50%;
      transform: translate(-50%, -50%) rotate(-45deg);
      background: red;
    } */
</style>